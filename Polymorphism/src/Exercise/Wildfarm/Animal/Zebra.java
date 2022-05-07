package Exercise.Wildfarm.Animal;

import Exercise.Wildfarm.FoodStuff.Food;
import Exercise.Wildfarm.FoodStuff.Meat;

public class Zebra extends Mammal {
    public Zebra(String name, String type, double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            throw new IllegalArgumentException(
                    "Zebras are not eating that type of food!");
        }
        super.eat(food);
    }
    @Override
    public void makeSound() {
        System.out.println("Zs");
    }
}
