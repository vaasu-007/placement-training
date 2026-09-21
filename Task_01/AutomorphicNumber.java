import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long square = (long) n * n;
        int temp = n;
        boolean isAutomorphic = true;

        while (temp > 0) {
            // Check if last digits match
            if (temp % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            temp /= 10;
            square /= 10;
        }

        if (isAutomorphic) {
            System.out.println(n + " is an Automorphic Number.");
        } else {
            System.out.println(n + " is Not an Automorphic Number.");
        }
    }
}
