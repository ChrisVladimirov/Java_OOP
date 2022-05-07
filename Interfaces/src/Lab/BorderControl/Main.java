package Lab.BorderControl;

import Lab.BorderControl.Citizen;
import Lab.BorderControl.Robot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        List<Robot> robots = new ArrayList<>();
        List<Citizen> citizens = new ArrayList<>();

        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");
            if (tokens.length == 2) {
                Robot r = new Robot(tokens[0], tokens[1]);
                robots.add(r);
            } else {
                Citizen c = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                citizens.add(c);
            }
            line = scanner.nextLine();
        }

        String suffix = scanner.nextLine();
        for (Robot robot : robots) {
            if (robot.getId().endsWith(suffix)) {
                System.out.println(robot.getId());
            }
        }

        for (Citizen citizen : citizens) {
            if (citizen.getId().endsWith(suffix)) {
                System.out.println(citizen.getId());
            }
        }
    }
}