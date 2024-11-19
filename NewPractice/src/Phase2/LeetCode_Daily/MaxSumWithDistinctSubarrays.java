package Phase2.LeetCode_Daily;

import java.util.HashSet;

public class MaxSumWithDistinctSubarrays {
    public static void main(String[] args) {
        int[]arr={ 4,4,4};
        System.out.println(MaxSubArray(arr,3));

    }
    public static int MaxSubArray(int[]arr,int k){
        int start=0;
        int end=k-1;
        int maxsum=0;
        while(end< arr.length){
            int sum=AddElements(arr,start,end,k);
            if(sum!=-1 && sum>maxsum){
                maxsum=sum;
            }
            start++;
            end++;
        }
        return maxsum;
    }

    private static int AddElements(int[] arr, int start, int end,int k) {
        HashSet<Integer>set=new HashSet<>();
        int sum=0;
        for(int i=start;i<=end;i++){
            if(set.contains(arr[i])){
                return -1;
            }
            set.add(arr[i]);

            sum+=arr[i];
        }
        if(set.size()==k){
            return sum;
        }
        else{
            return -1;
        }
    }
}
