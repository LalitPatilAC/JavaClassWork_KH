package Question_1;

public class TestStudent {

	public static void main(String[] args) {
		Student student1 = new Student();
        student1.name = "Sam";
        student1.roll_no = 1;
        student1.phone_no = "9876543210";
        student1.address = "123 Maple Street, New York";
        
        Student student2 = new Student();
        student2.name = "John";
        student2.roll_no = 2;
        student2.phone_no = "9123456780";
        student2.address = "456 Oak Avenue, Chicago";

        System.out.println("--- Student 1 Details ---");
        System.out.println("Name: " + student1.name);
        System.out.println("Roll Number: " + student1.roll_no);
        System.out.println("Phone Number: " + student1.phone_no);
        System.out.println("Address: " + student1.address);
        System.out.println();

       
        System.out.println("--- Student 2 Details ---");
        System.out.println("Name: " + student2.name);
        System.out.println("Roll Number: " + student2.roll_no);
        System.out.println("Phone Number: " + student2.phone_no);
        System.out.println("Address: " + student2.address);

	}

}
