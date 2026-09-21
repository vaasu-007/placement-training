import java.util.Scanner;

public class CountOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = Math.abs(n);
        int oddCount = 0;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) {
                oddCount++;
            }
            temp /= 10;
        }

        System.out.println("Count of odd digits: " + oddCount);
    }
}
