import java.util.Scanner;
import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] copiedArr = new int[size];
        for (int i = 0; i < size; i++) {
            copiedArr[i] = arr[i];
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Copied array: " + Arrays.toString(copiedArr));
    }
}