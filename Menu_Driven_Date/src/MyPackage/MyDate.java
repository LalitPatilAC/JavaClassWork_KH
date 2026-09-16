package MyPackage;

public class MyDate {
   
    private int day;
    private int month;
    private int year;

    // Default Constructor (Sets initial date to 01/01/2024)
    public MyDate() {
        this.day = 1;
        this.month = 1;
        this.year = 2024;
    }

    // Check if a year is a leap year
    public boolean isLeapYear(int y) {
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Get the maximum days for any given month and year
    public int getDaysInMonth(int m, int y) {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            return 31;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        } else if (m == 2) {
            return isLeapYear(y) ? 29 : 28; // Leap year check for February
        } else {
            return 0; // Invalid month
        }
    }

    // Setters with validation
    public boolean setDate(int d, int m, int y) {
        // Validate year and month first
        if (y < 1 || m < 1 || m > 12) {
            return false;
        }
        
        // Validate day based on the month and year
        int maxDays = getDaysInMonth(m, y);
        if (d < 1 || d > maxDays) {
            return false;
        }

        // If everything is valid, update the date
        this.day = d;
        this.month = m;
        this.year = y;
        return true;
    }

    // Getters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Add Days (adds day by day to handle month/year rollovers easily)
    public void addDays(int daysToAdd) {
        for (int i = 0; i < daysToAdd; i++) {
            day++;
            // If day exceeds max days in current month, move to next month
            if (day > getDaysInMonth(month, year)) {
                day = 1;
                month++;
                // If month exceeds 12, move to next year
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }
        }
    }

    // Add Months
    public void addMonths(int monthsToAdd) {
        month += monthsToAdd;
        while (month > 12) {
            month -= 12;
            year++;
        }
        // Adjust day if it exceeds the new month's maximum days (e.g., Jan 31 + 1 month)
        if (day > getDaysInMonth(month, year)) {
            day = getDaysInMonth(month, year);
        }
    }

    // Add Years
    public void addYears(int yearsToAdd) {
        year += yearsToAdd;
        // Handle leap year edge case (e.g., Feb 29 moving to a non-leap year)
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }
    }

    // Display Method
    public void displayDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}