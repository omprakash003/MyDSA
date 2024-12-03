package Phase2.GFG_POTD;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[]arr={-10, 8, 6, 9, -5, -10, -1, 6 ,6 ,-8, 9, 0, 1, -4 ,5 ,6, -2 ,10, 6, 10, -8, -1, -6 ,10 ,7};
        System.out.println(MaxProduct(arr));

    }
    public static int MaxProduct(int[]arr){
        int max=Integer.MIN_VALUE;
        int prefix=1;
        int suffix=1;
        int n= arr.length;

       for(int i=0;i<arr.length;i++){
           if(prefix==0){
               prefix=1;
           }
           if(suffix==0){
               suffix=1;
           }
           prefix*=arr[i];
           suffix*=arr[n-i-1];
           max=Math.max(max,Math.max(prefix,suffix));
       }

        return max;

    }
}
