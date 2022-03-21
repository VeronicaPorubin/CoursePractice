package TestingForMe.Inheritance.Shape;

public class Square extends TwoDimensionalShape{

    public Square(String figure, double dimension) {
        super(figure, dimension);
    }
    public double areaSquare () {return Math.pow(getDimension(),2.0);}
}
