package Exercise.Wildfarm.Animal;

import Exercise.Wildfarm.FoodStuff.Food;
import Exercise.Wildfarm.FoodStuff.Meat;

public abstract class Mammal extends Animal {


    protected Mammal(String name, String type, double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    /*public void eat(Food food) {
        if (food instanceof Meat){
            throw new IllegalArgumentException(getType() + " are not eating that type of food!");
        }
        super.eat(food);
    }*/
}
