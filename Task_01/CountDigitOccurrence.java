import java.util.Scanner;

public class CountDigitOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter the digit to search (0-9): ");
        int targetDigit = sc.nextInt();

        int temp = Math.abs(n);
        int count = 0;

        if (temp == 0 && targetDigit == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                int digit = temp % 10;
                if (digit == targetDigit) {
                    count++;
                }
                temp /= 10;
            }
        }

        System.out.println("Occurrence of digit " + targetDigit + ": " + count);
    }
}
