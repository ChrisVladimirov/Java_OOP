package Lab;

public class Dog extends Animal {
    public Dog(String name, String favFood) {
        super(name, favFood);
    }

    @Override
    String explainSelf() {
        return String.format("I am %s and my favourite food is %s%nDJAAF", this.getName(), this.getFavouriteFood());
    }
}
