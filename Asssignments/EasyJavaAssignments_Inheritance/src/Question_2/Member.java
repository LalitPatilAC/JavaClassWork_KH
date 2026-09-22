package Question_2;

public class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setAddress(String address) { this.address = address; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
    public double getSalary() { return salary; }

    
    public void printSalary() {
        System.out.println("Salary: $" + salary);
    }
}
