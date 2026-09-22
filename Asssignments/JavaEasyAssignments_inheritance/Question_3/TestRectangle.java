package Question_3;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(5, 8);

        System.out.println("--- Rectangle Area Calculations ---");
        System.out.println("Rectangle 1 (Sides: 4 × 5) Area: " + rect1.area() + " square units");
        System.out.println("Rectangle 2 (Sides: 5 × 8) Area: " + rect2.area() + " square units");

	}

}
