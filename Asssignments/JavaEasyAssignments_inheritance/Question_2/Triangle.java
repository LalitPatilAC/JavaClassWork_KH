package Question_2;

public class Triangle {

	double side1, side2, side3;

    public Triangle(double s1, double s2, double s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

 // Method to calculate the perimeter
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

 // Method to calculate the area using Heron's Formula
    public double calculateArea() {
        double s = calculatePerimeter() / 2.0; 
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
}
}
