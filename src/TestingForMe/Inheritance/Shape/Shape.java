package TestingForMe.Inheritance.Shape;

public class Shape {
    private String figure;

    public Shape(String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    public void setLines(String figure) {
        this.figure = figure;
    }
    @Override
    public String toString() {
        return "Shape{" +
                "figure='" + figure + '\'' +
                '}';
    }
}
