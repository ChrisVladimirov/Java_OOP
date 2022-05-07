package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();

        vehicleMap.put("Car", createVehicle(scanner.nextLine().split("\\s+")));
        vehicleMap.put("Truck", createVehicle(scanner.nextLine().split("\\s+")));

        Bus bus = createBus.apply(scanner.nextLine().split("\\s+"));
        vehicleMap.put("Bus", bus);

        int commands = Integer.parseInt(scanner.nextLine());
        while (commands-- > 0) {
            String command = scanner.nextLine();
            String[] params = command.split("\\s+");
            double argument = Double.parseDouble(params[2]);

            if (command.contains("Drive") && command.contains("Bus")) {
                System.out.println(bus.driveWithPassengers(argument));
            } else if (command.contains("Drive")) {
                System.out.println(vehicleMap.get(params[1]).drive(argument));
            } else {
                try {
                    vehicleMap.get(params[1]).refuel(argument);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        for (Vehicle value : vehicleMap.values()) {
            System.out.println(value.toString());
        }
    }

    private static final Function<String[], Bus> createBus = tokens -> new Bus(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));

    private static Vehicle createVehicle(String[] tokens) {
        switch (tokens[0]) {
            case "Car":
                return new Car(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
            case "Truck":
                return new Truck(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
            case "Bus":
                return createBus.apply(tokens);
            default:
                throw new IllegalStateException("Unknown vehicle type for " + tokens[0]);
        }
    }
}
