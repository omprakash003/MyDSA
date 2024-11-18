package Phase2.LeetCode_Daily;

import java.util.Arrays;

public class PowerOfSizeK_3254 {
    public static void main(String[] args) {
        int[]arr={1,3,4};
        System.out.println(Arrays.toString(PowerofK(arr,2)));


    }
    public static int[] PowerofK(int[]arr,int k){
        int start=0;int end=k-1;
        int results[]=new int[arr.length-k+1];
        int i=0;
        while(end<arr.length){
            results[i]=CheckMax(start,end,arr);
            start++;
            end++;
            i++;
        }
        return results;
    }
    private static int CheckMax(int start,int end,int[]arr){
        int max=arr[start];
        int prev=arr[start];
        for (int i = start+1; i <=end ; i++) {
            if(prev>=arr[i] || arr[i]-prev!=1){
                return -1;
        }
            if(arr[i]>max){
                max=arr[i];
            }
            prev=arr[i];

        }
        return max;
    }

}
