package Lab;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    protected void calculateArea() {
        Double result = width * height;
    }

    @Override
    protected void calculatePerimeter() {
        Double result = height * 2 * width;
    }
}
