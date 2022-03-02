package unit_9.in_class.ShapeClasses;

public class Shape {
    private String shape;
    private String color;
    private int numSides;

    // Constructor
    public Shape(String shape, String color, int numSides) {
        this.shape = shape;
        this.color = color;
        this.numSides = numSides;
    }

    public Shape(String shape, String color){
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

    public int getNumSides(){return numSides;}

    @Override
    public String toString(){
        if(getNumSides() == 0){
            return getShape() + " is " + getColor();
        } else {
            return getShape() + " is " + getColor() + " and has " + getNumSides() + " sides";
         }
    }
}
