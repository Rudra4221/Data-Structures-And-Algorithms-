
public class BestTimeToSellTheStock {

    public static int buyAndSellStock(int arr[]) {
        if (arr == null || arr.length == 0)
            return 0;

        int maxProfit = 0;
        int buyStock = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < buyStock) {
                buyStock = arr[i];
            }

            int profit = arr[i] - buyStock;

            maxProfit = Math.max(maxProfit, profit);

        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int arr[] = { 3, 4, 2, 1, 5, 7 };
        System.out.println(buyAndSellStock(arr));
    }
}
