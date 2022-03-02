package unit_9.in_class.ShapeClasses;

public class Square extends Rectangle{
    public Square(String shape, String color, int length){
        super(shape, color, length);
    }

    // Find the area by multiplying length by itself
    public int findArea(){
        return getLength() * getLength();
    }

    // Scale the size of the square by whatever value "v" is
    public double scaleSize(double v) {
        return findArea() * v;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
               "Length:\t" + super.getLength();
    }
}
