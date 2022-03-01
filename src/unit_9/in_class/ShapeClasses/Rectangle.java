package unit_9.in_class.ShapeClasses;

public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(String shape, String color, int length, int width){
        super(shape, color);
        this.length = length;
        this.width = width;
    }

    public Rectangle(String shape, String color, int length){
        super(shape, color);
        this.length = length;
    }

}
