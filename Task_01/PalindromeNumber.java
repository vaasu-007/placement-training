import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int reversed = 0;
        int temp = Math.abs(n);

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        if (n < 0) {
            reversed = -reversed;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome Number.");
        } else {
            System.out.println(original + " is Not a Palindrome Number.");
        }
    }
}
