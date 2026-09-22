package Question_2;

public class PrimeMember extends Member {
    private int joiningYear;
    private double joiningFees;
    private boolean isActive;

    // Mutators (Setters) for PrimeMember specific fields:
    public void setJoiningYear(int joiningYear) { this.joiningYear = joiningYear; }
    public void setJoiningFees(double joiningFees) { this.joiningFees = joiningFees; }
    public void setActive(boolean isActive) { this.isActive = isActive; }

    // Accessors (Getters) for PrimeMember specific fields:
    public int getJoiningYear() { return joiningYear; }
    public double getJoiningFees() { return joiningFees; }
    public boolean isActive() { return isActive; }

    //Display Methods all details:
    public void display() {
        System.out.println("--- Prime Member Details ---");
        System.out.println("Name         : " + getName());
        System.out.println("Age          : " + getAge());
        System.out.println("Phone Number : " + getPhoneNumber());
        System.out.println("Address      : " + getAddress());
        printSalary(); // Calling parent method
        System.out.println("Joining Year : " + joiningYear);
        System.out.println("Joining Fees : $" + joiningFees);
        System.out.println("Is Active    : " + (isActive ? "Yes" : "No"));
    }
}