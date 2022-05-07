package Exercise;

import java.text.DecimalFormat;
import java.util.function.Consumer;

public abstract class Vehicle {
    protected double fuel;
    private double consumption;
    private double tankCapacity;

    protected Vehicle(double fuel, double consumption, double tankCapacity) {
        this.tankCapacity = tankCapacity;
        this.setFuel(fuel);
        this.consumption = consumption;
    }

    private void setFuel(double fuel) {
        ensureNonNegativeFuel.accept(fuel);
        freeTankCapacity.accept(fuel);
        this.fuel = fuel;
    }

    protected Consumer<Double> addConsumption = additionalConsumption -> this.consumption += additionalConsumption;

    protected Consumer<Double> subtractConsumption = subtraction -> this.consumption -= subtraction;

    protected Consumer<Double> ensureNonNegativeFuel = fuel -> {
        if (fuel <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
    };

    protected Consumer<Double> freeTankCapacity = additionalFuel -> {
        if (additionalFuel > this.tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
    };

    public String drive(double distance) {
        double fuelNeeded = distance * this.consumption;
        if (fuelNeeded > this.fuel) {
            return this.getClass().getSimpleName() + " needs refueling";
        }
        this.setFuel(fuel - fuelNeeded);
        DecimalFormat formatter = new DecimalFormat("#.##");
        return String.format("%s travelled %s km", this.getClass().getSimpleName(), formatter.format(distance));
    }

    public void refuel(double liters) {
        ensureNonNegativeFuel.accept(liters);
        this.setFuel(fuel + liters);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuel);
    }
}
