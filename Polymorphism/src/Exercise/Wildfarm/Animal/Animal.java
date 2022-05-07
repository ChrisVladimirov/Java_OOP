package Exercise.Wildfarm.Animal;

import Exercise.Wildfarm.FoodStuff.Food;

import java.text.DecimalFormat;

public abstract class Animal {
    private String name;
    protected String type;
    private double weight;
    private String livingRegion;

    private int foodEaten;

    protected Animal(String name, String type, double weight, String livingRegion) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.livingRegion = livingRegion;
    }

    public abstract void makeSound();

    public void eat(Food food) {
        this.foodEaten += food.getQuantity();
    }

    protected String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("##.##");
        return String.format(
                "%s[%s, %s, %s, %d]",
                this.type,
                this.name,
                formatter.format(this.weight),
                this.livingRegion,
                this.foodEaten
        );
    }
}
