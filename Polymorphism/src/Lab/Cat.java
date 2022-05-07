package Lab;

public class Cat extends Animal {
    public Cat(String name, String favFood) {
        super(name, favFood);
    }

    @Override
    String explainSelf() {
        return String.format("I am %s and my favourite food is %s%nMEEOW", this.getName(), this.getFavouriteFood());
    }
}
