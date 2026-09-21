import java.util.Scanner;

public class FindLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = Math.abs(n);
        int maxDigit = 0;

        if (temp == 0) {
            maxDigit = 0;
        } else {
            while (temp > 0) {
                int digit = temp % 10;
                if (digit > maxDigit) {
                    maxDigit = digit;
                }
                temp /= 10;
            }
        }

        System.out.println("Largest digit: " + maxDigit);
    }
}
