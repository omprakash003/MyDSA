package Phase2.GFG_POTD;

public class BestBuyAndSellStocks {
    public static void main(String[] args) {
        int[]arr={100,180,260,310,40,535,695};
        System.out.println(MaximumProfit(arr));

    }
    public static int MaximumProfit(int[]arr){
        int i=0;
        int j=i+1;
        int max=0;
        int buy=arr[i];
        int sell=arr[j];
        while(i< arr.length-1){
            if(buy<sell) {
                max += sell - buy;
            }
            i++;

            buy=sell;
            if(i< arr.length-1) {
                sell = arr[i + 1];
            }

        }
        return max;
    }
}
