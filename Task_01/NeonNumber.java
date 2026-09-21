import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int sumOfDigits = 0;
        int temp = square;

        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        if (sumOfDigits == n) {
            System.out.println(n + " is a Neon Number.");
        } else {
            System.out.println(n + " is Not a Neon Number.");
        }
    }
}
