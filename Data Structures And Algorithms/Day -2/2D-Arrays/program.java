
public class program {

    public static void linearSerach(int arr[][], int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (target == arr[i][j]) {
                    System.out.println(i + "," + j);
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        linearSerach(arr, 4);

    }
}
