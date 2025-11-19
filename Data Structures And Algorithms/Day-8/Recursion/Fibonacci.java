
public class Fibonacci {

    public static int printFibonacci(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return printFibonacci(n - 1) + printFibonacci(n - 2);
    }

    public static void main(String[] args) {

        int n = 15;

        System.out.println();
    }
}
