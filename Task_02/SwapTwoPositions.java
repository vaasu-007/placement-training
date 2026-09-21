import java.util.Scanner;

public class SwapTwoPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter first index to swap (0 to " + (n - 1) + "): ");
        int pos1 = sc.nextInt();

        System.out.print("Enter second index to swap (0 to " + (n - 1) + "): ");
        int pos2 = sc.nextInt();

        if (pos1 >= 0 && pos1 < n && pos2 >= 0 && pos2 < n) {
            int temp = arr[pos1];
            arr[pos1] = arr[pos2];
            arr[pos2] = temp;

            System.out.println("Array after swapping positions " + pos1 + " and " + pos2 + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Invalid positions entered!");
        }
    }
}

