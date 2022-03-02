package unit_9.in_class.ShapeClasses;

public class Rectangle extends Shape{
    private int length;
    private int width;

    // Constructor
    public Rectangle(String shape, String color, int length, int width){
        super(shape, color);
        this.length = length;
        this.width = width;
    }

    public Rectangle(String shape, String color, int length){
        super(shape, color);
        this.length  = length;
    }

    // Find the area of a rectangle
    public int findArea(){
        return length * width;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){return width;}

    // Partial Override
    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Width:\t" + getWidth() + "\n" +
                "Length:\t" + getLength();
    }
}
