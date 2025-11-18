
public class PrintTenToOne {

    public static void printTenToOne(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printTenToOne(n - 1);
    }

    public static void main(String[] args) {

        int n = 10;

        printTenToOne(n);
    }
}
