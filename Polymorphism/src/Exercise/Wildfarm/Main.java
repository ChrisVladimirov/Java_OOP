package Exercise.Wildfarm;

import Exercise.Wildfarm.Animal.Mouse;
import Exercise.Wildfarm.Animal.Tiger;
import Exercise.Wildfarm.Animal.Zebra;
import Exercise.Wildfarm.FoodStuff.Food;
import Exercise.Wildfarm.FoodStuff.Meat;
import Exercise.Wildfarm.FoodStuff.Vegetable;
import Exercise.Wildfarm.Animal.Animal;
import Exercise.Wildfarm.Animal.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String evenLine = scanner.nextLine();
        List<Animal> animalList = new ArrayList<>();
        while (!evenLine.equals("End")) {
            Animal animal = createAnimal.apply(evenLine.split("\\s+"));
            String oddLine = scanner.nextLine();
            Food food = createFood.apply(oddLine.split("\\s+"));
            animal.makeSound();
            try {
                animal.eat(food);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            animalList.add(animal);
            evenLine = scanner.nextLine();
        }
        for (Animal animal : animalList) {
            System.out.println(animal.toString());
        }
    }

    private static final Function<String[], Animal> createAnimal = input -> {
        switch (input[0]) {
            case "Cat":
                return new Cat(input[1], "Cat", Double.parseDouble(input[2]), input[3], input[4]);
            case "Tiger":
                return new Tiger(input[1], "Tiger", Double.parseDouble(input[2]), input[3]);
            case "Zebra":
                return new Zebra(input[1], "Zebra", Double.parseDouble(input[2]), input[3]);
            case "Mouse":
                return new Mouse(input[1], "Mouse", Double.parseDouble(input[2]), input[3]);
            default:
                throw new IllegalArgumentException("Unknown animal type " + input[0]);
        }
    };

    private static final Function<String[], Food> createFood = input -> {
        int quantity = Integer.parseInt(input[1]);
        return input[0].equals("Meat") ? new Meat(quantity) : new Vegetable(quantity);
    };
}