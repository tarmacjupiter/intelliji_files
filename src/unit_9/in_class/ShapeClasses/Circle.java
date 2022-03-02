package unit_9.in_class.ShapeClasses;

public class Circle extends Shape{
    private int radius;

    // Constructor
    public Circle(String shape, String color, int radius) {
        super(shape, color);
        this.radius = radius;
    }

    // Find area by πr^2
    public double findArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public int getRadius(){return radius;}

    @Override
    public String toString(){
        return super.toString() + " which also has a radius of " + getRadius();
    }
}
