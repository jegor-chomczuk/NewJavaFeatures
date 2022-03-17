public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(4.0, 3.2);
        Circle circle1 = new Circle(point1, 1.0);

        System.out.println(point1.distance(point2));
        System.out.println(circle1.getArea());
        circle1.getDiameter();
    }
}
