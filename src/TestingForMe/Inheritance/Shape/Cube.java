package TestingForMe.Inheritance.Shape;

public class Cube extends ThreeDimensionalShape {

    public Cube(String figure, double dimension1) {
        super(figure, dimension1);
    }
    public double areaCube () {
        return 6 * Math.pow(getDimension1(), 2.0);
    }
}
