package Question_3;

public class Rectangle {
    double length;
    double breadth;


    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}
