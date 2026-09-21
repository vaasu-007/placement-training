import java.util.Scanner;

public class MoveNegativesToBeginning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int index = 0;

        // First copy all negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                result[index++] = arr[i];
            }
        }

        // Then copy all non-negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                result[index++] = arr[i];
            }
        }

        System.out.println("Array after moving negative numbers to the beginning:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}

