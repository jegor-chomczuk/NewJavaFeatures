public final class Triangle extends Polygon{
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public String getArea() {
        return String.format("getArea() called from %s,", this);
    }
}
