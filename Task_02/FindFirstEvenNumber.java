import java.util.Scanner;

public class FindFirstEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int firstEven = -1;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                firstEven = arr[i];
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("First even number: " + firstEven);
        } else {
            System.out.println("No even number found in the array.");
        }
    }
}

