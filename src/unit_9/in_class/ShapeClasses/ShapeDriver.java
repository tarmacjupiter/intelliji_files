package unit_9.in_class.ShapeClasses;

public class ShapeDriver {
    public static void main(String[] args) {
        Circle myCircle = new Circle("Circle", "Blue", 8247);
        Rectangle myRect = new Rectangle("Rectangle", "Purple", 82, 47);
        Square mySquare = new Square("Square", "Grey", 21);

        System.out.println(myCircle);
        System.out.println();
        System.out.println(myRect);
        System.out.println();
        System.out.println(mySquare);
        System.out.println();

        System.out.println("Circle Area:\t" + myCircle.findArea());
        System.out.println();
        System.out.println("Rectangle Area:\t" + myRect.findArea());
        System.out.println();
        System.out.println("Square Area:\t" + mySquare.findArea());
    }
}
