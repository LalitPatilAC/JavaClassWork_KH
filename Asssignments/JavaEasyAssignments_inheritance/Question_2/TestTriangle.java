package Question_2;

public class TestTriangle {

	public static void main(String[] args) {
		
		Triangle myTriangle = new Triangle(3, 4, 5);

        // Printing the results
        System.out.println("--- Triangle Calculations ---");
        System.out.println("Side lengths: 3, 4, 5 units");
        System.out.println("Perimeter: " + myTriangle.calculatePerimeter() + " units");
        System.out.println("Area: " + myTriangle.calculateArea() + " square units");

	}

}
