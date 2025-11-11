
public class KadanesAlgorithm {

    public static int kadanesAlgorithm(int arr[]) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int arr[] = { -2, -4, -1, -5, 33 };

        System.out.println(kadanesAlgorithm(arr));
    }
}
