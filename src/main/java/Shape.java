public sealed interface Shape permits Circle, Polygon{
    String getArea();

    default String getDiameter(){
        return "getDiameter() called for " +
                switch (this) {
                    case Circle circle -> "Circle";
                    case Section section -> "Section";
                    case Triangle triangle -> "Triangle";
                    default -> throw new IllegalStateException("Unexpected value: " + this);
               };
    }
}
