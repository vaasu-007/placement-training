import java.util.Scanner;

public class SumOfOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = Math.abs(n);
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            temp /= 10;
        }

        System.out.println("Sum of odd digits: " + sum);
    }
}
