package Question_5;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Robert", 1994, 50000.0, "64C- WallsStreat");
        Employee emp2 = new Employee("Sam", 2000, 55000.0, "68D- WallsStreat");
        Employee emp3 = new Employee("John", 1999, 60000.0, "26B- WallsStreat");

        System.out.printf("%-10s %-18s %-20s\n", "Name", "Year of joining", "Address");
        System.out.println("--------------------------------------------------");

        System.out.printf("%-10s %-18d %-20s\n", emp1.name, emp1.yearOfJoining, emp1.address);
        System.out.printf("%-10s %-18d %-20s\n", emp2.name, emp2.yearOfJoining, emp2.address);
        System.out.printf("%-10s %-18d %-20s\n", emp3.name, emp3.yearOfJoining, emp3.address);

	}

}
