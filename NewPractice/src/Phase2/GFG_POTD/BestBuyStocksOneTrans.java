package Phase2.GFG_POTD;

public class BestBuyStocksOneTrans {
    public static void main(String[] args) {
int prices[] = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maximumProfit(prices));
    }
    public static int maximumProfit(int []arr) {
        // Code here
        int n=arr.length;
        int buy=arr[0];
        int j=1;
        int max=0;


        while(j<n ){

           int sell=arr[j];
           if(sell>buy){
               max=Math.max(max,sell-buy);
           }
           else{
               buy=sell;

           }
           j++;



        }

        return max;

    }
}
