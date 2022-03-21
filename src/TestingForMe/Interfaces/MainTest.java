package TestingForMe.Interfaces;

public class MainTest {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        Rectangle rectangle = new Rectangle(5.6,8.2);
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Perimeter of Circle: " + circle.getPerimeter());

        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());
    }
}
