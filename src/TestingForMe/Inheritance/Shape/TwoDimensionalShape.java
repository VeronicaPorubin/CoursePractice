package TestingForMe.Inheritance.Shape;

public abstract class TwoDimensionalShape extends Shape{
    private double Dimension;


    public TwoDimensionalShape(String figure, double dimension) {
        super(figure);
        Dimension = dimension;
    }

    public double getDimension() {
        return Dimension;
    }

    public void setDimension(double dimension) {
        this.Dimension = dimension;
    }

    public TwoDimensionalShape(String figure) {
        super(figure);
    }
    @Override
    public String toString() {
        return "TwoDimensionalShape{" +
                "Dimension= " + Dimension + " figure= " + getFigure() +
                '}';
    }

}
