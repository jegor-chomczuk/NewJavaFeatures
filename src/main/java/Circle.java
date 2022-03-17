public record Circle(Point center, double r) implements Shape{

    public Circle {
        if (r < 0.0) {
            throw new IllegalArgumentException("Radius cannot be less then 0.");
        }
    }

    @Override
    public String getArea() {
        return String.format("getArea() called from %s,", this);
    }
}