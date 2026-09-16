import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComplexNumber[] arr = new ComplexNumber[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = new ComplexNumber();
            System.out.print("Enter number1 for object " + (i + 1) + ": ");
            arr[i].setNumber1(sc.nextInt());
            System.out.print("Enter number2 for object " + (i + 1) + ": ");
            arr[i].setNumber2(sc.nextInt());
        }

        System.out.println("\nResults of multiplication:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Object " + (i + 1) + " result: " + arr[i].computeComplexNumber());
        }
    }
}

