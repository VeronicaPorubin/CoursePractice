package TestingForMe.Inheritance.Shape;

public class Sphere extends ThreeDimensionalShape{
    public Sphere(String figure, double dimension1) {
        super(figure, dimension1);
    }
    public double areaSphere () {
        return 4* Math.PI * Math.pow(getDimension1(),2.0);
    }
}
