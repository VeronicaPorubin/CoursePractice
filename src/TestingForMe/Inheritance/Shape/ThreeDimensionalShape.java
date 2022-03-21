package TestingForMe.Inheritance.Shape;

public class ThreeDimensionalShape extends Shape{
    private double Dimension1;

    @Override
    public String toString() {
        return "ThreeDimensionalShape{" +
                "Dimension1=" + Dimension1 + " figure= " + getFigure() +
                '}';
    }

    public ThreeDimensionalShape(String figure, double dimension1) {
        super(figure);
        Dimension1 = dimension1;

    }

    public double getDimension1() {
        return Dimension1;
    }

    public void setDimension1(double dimension1) {
        Dimension1 = dimension1;
    }



    public ThreeDimensionalShape(String figure) {
        super(figure);
    }

}
