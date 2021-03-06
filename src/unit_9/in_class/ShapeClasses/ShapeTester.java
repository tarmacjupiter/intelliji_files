package unit_9.in_class.ShapeClasses;

public class ShapeTester {
    public static void main(String[] args) {
        Shape shape = new Shape("Random shape", "White", 4);
        Circle circle = new Circle("Circle", "Grey", 5);
        Rectangle rectangle = new Rectangle("Rectangle", "Yellow", 4, 7);
        Square square = new Square("Square", "Blue",  3);
        Circle circle1 = new Circle("Circle", "Red", 24);

        System.out.println(shape + "\n");

        System.out.println(circle);
        System.out.println("Area: " + circle.findArea() + "\n");

        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.findArea() + "\n");

        System.out.println(square);
        System.out.println("Area: " + square.findArea() + "\n");

        square.scaleSize(0.5);
        System.out.println(square);
        System.out.println();

        System.out.println(circle1);
        System.out.println("Area: " + circle1.findArea() + "\n");
    }
}
