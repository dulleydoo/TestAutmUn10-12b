package abstractionchap11a;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}
