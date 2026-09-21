import java.util.Scanner;

public class CountSmallerThanAverage {
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
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double average = sum / n;
        System.out.println("Average: " + average);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < average) {
                count++;
            }
        }

        System.out.println("Count of elements smaller than average: " + count);
    }
}

