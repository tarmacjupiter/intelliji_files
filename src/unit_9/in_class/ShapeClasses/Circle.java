package unit_9.in_class.ShapeClasses;


public class Circle extends Shape{
    private int radius;

    public Circle(String shape, String color, int radius) {
        super(shape, color);
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString(){
        return "This shape is a " + getShape() + " and is " + getColor();
    }
}
