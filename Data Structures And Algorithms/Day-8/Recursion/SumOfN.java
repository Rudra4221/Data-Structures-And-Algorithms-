
public class SumOfN {

    public static int printSumOfN(int n) {

        if (n == 1) {
            return 1;
        }

        return n + printSumOfN(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(printSumOfN(n));
    }
}
