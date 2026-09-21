import java.util.Scanner;

public class CountGreaterThanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target number: ");
        int target = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > target) {
                count++;
            }
        }

        System.out.println("Count of elements greater than " + target + ": " + count);
    }
}

