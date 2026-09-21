import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = Math.abs(n);
        int product = 1;

        if (temp == 0) {
            product = 0;
        } else {
            while (temp > 0) {
                int digit = temp % 10;
                product *= digit;
                temp /= 10;
            }
        }

        System.out.println("Product of digits: " + product);
    }
}
