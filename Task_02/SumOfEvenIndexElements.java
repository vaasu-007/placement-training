import java.util.Scanner;

public class SumOfEvenIndexElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum += arr[i];
        }

        System.out.println("Sum of elements at even indices: " + sum);
    }
}

