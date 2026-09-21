import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter range up to which table should be printed: ");
        int range = sc.nextInt();

        System.out.println("Multiplication Table for " + n + ":");
        for (int i = 1; i <= range; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
