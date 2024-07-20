public class FibonacciSeries {

    public static void printFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Number of terms must be greater than 0.");
            return;
        }

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int terms = 10; // You can change this value to print more or fewer terms
        printFibonacci(terms);
    }
}
