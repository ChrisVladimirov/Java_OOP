package Lab.PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }

    public boolean contains(Point p) {
        boolean isInHorizontal = this.bottomLeft.getX() <= p.getX()
                &&
                this.topRight.getX() >= p.getX();

        boolean isInVertical = this.bottomLeft.getY() <= p.getY()
                &&
                this.topRight.getY() >= p.getY();

        return isInHorizontal && isInVertical;
    }
}