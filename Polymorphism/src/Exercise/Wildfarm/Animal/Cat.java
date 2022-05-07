package Exercise.Wildfarm.Animal;

public class Cat extends Felime {
    private String breed;

    public Cat(String name, String type, double weight, String livingRegion, String breed) {
        super(name, type, weight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        StringBuilder base = new StringBuilder(super.toString());
        base.insert(base.indexOf(",") + 1, " " + this.breed + ",");
        return base.toString();
    }
}
