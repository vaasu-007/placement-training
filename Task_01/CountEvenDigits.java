import java.util.Scanner;

public class CountEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = Math.abs(n);
        int evenCount = 0;

        if (temp == 0) {
            evenCount = 1; // 0 is an even digit
        } else {
            while (temp > 0) {
                int digit = temp % 10;
                if (digit % 2 == 0) {
                    evenCount++;
                }
                temp /= 10;
            }
        }

        System.out.println("Count of even digits: " + evenCount);
    }
}
