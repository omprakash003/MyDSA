package Phase2.LeetCode_Daily;

import java.util.Arrays;

public class NumberOfFairPairs {
    public static void main(String[] args) {
        int[]arr={0,1,7,4,4,5};
        int m=count(arr,3,6);
        System.out.println(m);

    }
    public static int count (int []arr,int lower,int upper){
        Arrays.sort(arr);

        int up=Bounds(arr,upper+1);
        int low=Bounds(arr,lower);
        return up-low;

    }
   public static int Bounds(int []arr,int target){
        int left=0;
        int res=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum<target){
                res=res+(right-left);
                left=left+1;
            }
            else{
                right=right-1;
            }
        }
        return res;
   }
}
