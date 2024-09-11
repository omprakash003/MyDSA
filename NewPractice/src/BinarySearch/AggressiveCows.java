package BinarySearch;
import java.util.*;

public class AggressiveCows {
    public static void main(String[] args) {
        int []arr={0,3,4,7,9,10};
        System.out.println(MinDistanceIsMax(arr,4));

    }
    public static int MinDistanceIsMax(int[]arr,int cows){
        Arrays.sort(arr);
        int low=arr[0];
        int high=arr[arr.length-1]-arr[0];
        int ans=0;


        while(low<=high){
            int mid=(low+high)/2;
            int count=CountCows(arr,mid);
            if(count>=cows){
                ans=Math.max(ans,mid);
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
    }

    private static int CountCows(int[] arr, int mid) {
        int count=1;
        int a=arr[0];
        for(int i=1;i< arr.length;i++ ){
            if((arr[i]-a)>=mid){
                count++;
                a=arr[i];

            }
        }
        return count;
    }

    private static int min(int []arr){
        int low=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<low){
                low=arr[i];
            }
        }
        return low;
    }
    private static int max(int []arr){
        int low=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>low){
                low=arr[i];
            }
        }
        return low;
    }
}
