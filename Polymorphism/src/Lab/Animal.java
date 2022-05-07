package Lab;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    public Animal(String name, String favFood) {
        this.name = name;
        this.favouriteFood = favFood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    abstract String explainSelf();

    public String getName() {
        return name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }
}
