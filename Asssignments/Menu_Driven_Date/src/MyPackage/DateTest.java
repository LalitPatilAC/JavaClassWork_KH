package MyPackage;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyDate date = new MyDate();
        int choice;

        do {
            System.out.println("\n--- DATE MENU ---");
            System.out.println("1. Set date");
            System.out.println("2. Add Days");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Display");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter day: ");
                    int d = scanner.nextInt();
                    System.out.print("Enter month: ");
                    int m = scanner.nextInt();
                    System.out.print("Enter year: ");
                    int y = scanner.nextInt();

                    boolean success = date.setDate(d, m, y);
                    if (success) {
                        System.out.println("Date successfully set!");
                    } else {
                        System.out.println("Invalid date or out-of-range values (check leap year/month days).");
                    }
                    break;

                case 2:
                    System.out.print("Enter days to add: ");
                    int addD = scanner.nextInt();
                    if (addD >= 0) {
                        date.addDays(addD);
                        System.out.println("Days added successfully.");
                    } else {
                        System.out.println("Please enter a positive number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter months to add: ");
                    int addM = scanner.nextInt();
                    if (addM >= 0) {
                        date.addMonths(addM);
                        System.out.println("Months added successfully.");
                    } else {
                        System.out.println("Please enter a positive number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter years to add: ");
                    int addY = scanner.nextInt();
                    if (addY >= 0) {
                        date.addYears(addY);
                        System.out.println("Years added successfully.");
                    } else {
                        System.out.println("Please enter a positive number.");
                    }
                    break;

                case 5:
                    date.displayDate();
                    break;

                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose between 1-5 or 7.");
            }
        } while (choice != 7);

        scanner.close();
    }
}