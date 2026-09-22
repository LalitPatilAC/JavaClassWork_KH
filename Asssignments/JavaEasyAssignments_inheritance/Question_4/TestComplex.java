package Question_4;
import java.util.Scanner;

public class TestComplex {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Taking inputs for the first complex number
        System.out.println("--- Enter First Complex Number ---");
        System.out.print("Enter real part: ");
        double r1 = scanner.nextDouble();
        System.out.print("Enter imaginary part: ");
        double i1 = scanner.nextDouble();
        Complex c1 = new Complex(r1, i1);

        // Taking inputs for the second complex number
        System.out.println("\n--- Enter Second Complex Number ---");
        System.out.print("Enter real part: ");
        double r2 = scanner.nextDouble();
        System.out.print("Enter imaginary part: ");
        double i2 = scanner.nextDouble();
        Complex c2 = new Complex(r2, i2);

        scanner.close();

        // Performing operations
        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);

        // Displaying results
        System.out.println("\n--- Calculations Results ---");
        System.out.print("Sum: ");
        sum.display();

        System.out.print("Difference: ");
        difference.display();

        System.out.print("Product: ");
        product.display();

	}

}
