package Question_6;

public class Employee {
    double salary;
    int hoursPerDay;

    public void getInfo(double salary, int hoursPerDay) {
        this.salary = salary;
        this.hoursPerDay = hoursPerDay;
    }

    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }
    
    public void addWork() {
        if (hoursPerDay > 6) {
            salary += 5;
        }
    }

    public double getSalary() {
        return salary;
    }
}
