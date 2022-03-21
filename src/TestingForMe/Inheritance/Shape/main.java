package TestingForMe.Inheritance.Shape;

public class main {
    public static void main(String[] args) {
        Circle cirlce = new Circle("Circle", 5.7);
        System.out.println("Area of Circle: " + cirlce.areaCircle() );

        Square square = new Square("Square", 3.99);
        System.out.println("Area of Square: " + square.areaSquare());

        Sphere sphere = new Sphere( "Sphere", 3.5);
        System.out.println("Area of Sphere: " + sphere.areaSphere());

        Cube cube = new Cube("Cube", 2.7);
        System.out.println("Area of Cube: " + cube.areaCube());
    }



}
