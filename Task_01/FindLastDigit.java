import java.util.Scanner;

public class FindLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int lastDigit = Math.abs(n) % 10;
        System.out.println("The last digit is: " + lastDigit);
    }
}
