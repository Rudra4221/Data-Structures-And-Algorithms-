
public class BestTimeToSellTheStock {

    public static int buyAndSellStock(int arr[]) {

        int maxProfit = 0;
        int buyStock = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (buyStock > arr[i]) {
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
