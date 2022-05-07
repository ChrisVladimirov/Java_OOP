package Exercise;

public class Bus extends Vehicle {
    private static final double AIR_CONDITIONER_ADDITIONAL_CONSUMPTION = 1.4;

    public Bus(double fuel, double consumption, double tankCapacity) {
        super(fuel, consumption, tankCapacity);
    }

    public String driveWithPassengers(double distance) {
        super.addConsumption.accept(AIR_CONDITIONER_ADDITIONAL_CONSUMPTION);
        String output = super.drive(distance);
        super.subtractConsumption.accept(AIR_CONDITIONER_ADDITIONAL_CONSUMPTION);
        return output;
    }
}
