import java.util.Scanner;

public class PrintMiddleElement {
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

        if (n % 2 != 0) {
            System.out.println("Middle element: " + arr[n / 2]);
        } else {
            System.out.println("Middle elements are: " + arr[(n / 2) - 1] + " and " + arr[n / 2]);
        }
    }
}

