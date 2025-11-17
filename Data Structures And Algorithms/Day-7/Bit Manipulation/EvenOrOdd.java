
public class EvenOrOdd {

    public static void evenOrOdd(int n) {

        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {

        evenOrOdd(1);
        evenOrOdd(4);
    }
}
