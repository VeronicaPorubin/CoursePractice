package TestingForMe.Inheritance.Shape;

public class Circle extends TwoDimensionalShape{

    public Circle(String figure, double dimension) {super(figure, dimension);
    }

public  double areaCircle(){return Math.pow(getDimension (),2.0) * Math.PI;}

}
