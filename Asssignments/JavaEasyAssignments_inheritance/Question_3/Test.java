package Question_3;

public class Test {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.println("--- Rectangle Details ---");
        System.out.println("Dimensions: Length = 5.0, Breadth = 3.0");
        rect.printArea();
        rect.printPerimeter();

        System.out.println();

        // Creating a Square object with side = 4
        Square square = new Square(4.0);
        System.out.println("--- Square Details ---");
        System.out.println("Dimensions: Side = 4.0");
        square.printArea();
        square.printPerimeter();

	}

}
