
import java.util.Scanner;

public class FactorFinder {

    public static void findFactors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        System.out.println("Factors of " + number + " are:");
        findFactors(number);
        scanner.close();
    }
}
