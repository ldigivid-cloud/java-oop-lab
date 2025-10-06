public class PolyDemo {
    public static void main(String[] args) {
        // Polymorphic references
        Shape shape;

        // Circle
        shape = new Circle(5);
        shape.area();

        // Rectangle
        shape = new Rectangle(4, 6);
        shape.area();

        // Triangle
        shape = new Triangle(4, 7);
        shape.area();
    }
}
