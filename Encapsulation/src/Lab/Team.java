package Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private final List<Person> firstTeam;
    private final List<Person> reserveTeam;

    public Team(String name) {
        setName(name);
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeam);
    }

    public void addPlayer(Person player) {
        if (player.getAge() < 40) {
            firstTeam.add(player);
        } else {
            reserveTeam.add(player);
        }
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
