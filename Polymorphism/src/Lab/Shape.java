package Lab;

public abstract class Shape {
    private Double perimeter;
    private Double area;

    protected Shape() {
    }

    public Double getPerimeter() {
        calculatePerimeter();
        return perimeter;
    }

    protected abstract void calculateArea();

    protected abstract void calculatePerimeter();

    public Shape(Double perimeter, Double area) {
        setPerimeter(perimeter);
        setArea(area);
    }

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getArea() {
        calculateArea();
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
