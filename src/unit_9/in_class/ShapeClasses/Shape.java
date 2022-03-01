package unit_9.in_class.ShapeClasses;

public class Shape {
    private String shape;
    private String color;

    // Constructor
    public Shape(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    // Getters
    public String getShape(){
        return shape;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return "This shape is a " + getShape() + " and is " + getColor();
    }
}
