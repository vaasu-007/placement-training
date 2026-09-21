import java.util.Scanner;

public class FindSmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = Math.abs(n);
        int minDigit = 9;

        if (temp == 0) {
            minDigit = 0;
        } else {
            while (temp > 0) {
                int digit = temp % 10;
                if (digit < minDigit) {
                    minDigit = digit;
                }
                temp /= 10;
            }
        }

        System.out.println("Smallest digit: " + minDigit);
    }
}
