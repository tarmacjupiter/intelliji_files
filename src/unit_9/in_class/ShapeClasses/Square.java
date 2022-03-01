package unit_9.in_class.ShapeClasses;

public class Square extends Rectangle{
    public Square(String shape, String color, int length){
        super(shape, color, length);
    }

    public int findArea(){
        return getLength() * getLength();
    }

    public double scaleSize(double v) {
        return (getLength() * v) * (getLength() * v);
    }

    @Override
    public String toString(){
        return "This shape is a " + getShape() + " and is " + getColor();
    }
}
