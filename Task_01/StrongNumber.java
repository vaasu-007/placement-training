import java.util.Scanner;

public class StrongNumber {
    // Function to calculate factorial of a digit
    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        if (sum == original && original > 0) {
            System.out.println(original + " is a Strong Number.");
        } else {
            System.out.println(original + " is Not a Strong Number.");
        }
    }
}
