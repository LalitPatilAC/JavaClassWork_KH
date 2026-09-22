package Question_2;
import java.util.Scanner;

public class TestMember {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        PrimeMember primeMember = new PrimeMember();

        System.out.println("--- Enter Details for Prime Member ---");

        System.out.print("Enter Name: ");
        primeMember.setName(scanner.nextLine());

        System.out.print("Enter Age: ");
        primeMember.setAge(scanner.nextInt());
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Phone Number: ");
        primeMember.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter Address: ");
        primeMember.setAddress(scanner.nextLine());

        System.out.print("Enter Salary: ");
        primeMember.setSalary(scanner.nextDouble());

        System.out.print("Enter Joining Year: ");
        primeMember.setJoiningYear(scanner.nextInt());

        System.out.print("Enter Joining Fees: ");
        primeMember.setJoiningFees(scanner.nextDouble());

        System.out.print("Is Active (true/false): ");
        primeMember.setActive(scanner.nextBoolean());

        scanner.close();

        System.out.println("\n");
        
       //display data using display method:
        primeMember.display();

	}

}
