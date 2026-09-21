import java.util.Scanner;

public class CheckContainsZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = Math.abs(n);
        boolean containsZero = false;

        if (temp == 0) {
            containsZero = true;
        } else {
            while (temp > 0) {
                int digit = temp % 10;
                if (digit == 0) {
                    containsZero = true;
                    break;
                }
                temp /= 10;
            }
        }

        if (containsZero) {
            System.out.println("The number contains 0.");
        } else {
            System.out.println("The number does Not contain 0.");
        }
    }
}
