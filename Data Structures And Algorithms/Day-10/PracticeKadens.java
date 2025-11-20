
public class PracticeKadens {

    public static int printBiggest(int arr[]) {

        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++) {

            cs = cs + arr[i];

            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(cs, ms);

        }

        return ms;
    }

    public static void main(String[] args) {

        int arr[] = { -2, 4, 1, 2, -6, 3 };

        System.out.println(printBiggest(arr));
    }
}
