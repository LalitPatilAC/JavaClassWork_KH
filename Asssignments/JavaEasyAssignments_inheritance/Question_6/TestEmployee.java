package Question_6;

public class TestEmployee {

	public static void main(String[] args) {
	
		Employee emp = new Employee();

        // Initializing with a salary of $450 and 7 hours of work per day
        emp.getInfo(450.0, 7);

        // Applying the business rules
        emp.addSal();   // Adds $10 because salary (450) < 500
        emp.addWork();  // Adds $5 because hours (7) > 6

        // Printing the final calculated salary
        System.out.println("--- Employee Final Salary ---");
        System.out.println("Initial Salary: $450.0");
        System.out.println("Hours Worked Per Day: 7 hours");
        System.out.println("Final Calculated Salary: $" + emp.getSalary());

	}

}
