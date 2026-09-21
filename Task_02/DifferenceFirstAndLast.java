import java.util.Scanner;

public class DifferenceFirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array is empty.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int difference = arr[0] - arr[n - 1];
        System.out.println("Difference (First - Last): " + difference);
        System.out.println("Absolute Difference: " + Math.abs(difference));
    }
}

