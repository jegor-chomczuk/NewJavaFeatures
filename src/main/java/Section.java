public final class Section extends Polygon{
    private Point point1;
    private Point point2;

    public Section(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String getArea() {
        return String.format("getArea() called from %s,", this);
    }
}
