
public class SubArrays {

    public static void printSubarrays(int arr[]) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.print("SUM" + " = " + sum);
                System.out.println();

                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println();
        }

        System.out.println("The max sum of subarray is : " + max);

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };

        printSubarrays(arr);
    }
}
