package Exercises.TrafficLights;

public class TrafficLight {
    private Colour colour;

    public void changeColour() {
        switch (colour) {
            case RED:
                colour = Colour.GREEN;
                break;
            case GREEN:
                colour = Colour.YELLOW;
                break;
            case YELLOW:
                colour = Colour.RED;
                break;
        }
    }

    public TrafficLight(Colour colour) {
        this.colour = colour;
    }

    public Colour getColour() {
        return this.colour;
    }
}
