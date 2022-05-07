package Exercise.PlayersAndMonsters;

public class Hero {
    private String username;
    private int level;

    public Hero(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "username='" + username + '\'' +
                ", level=" + level +
                '}';
    }
}
