package Phase2.LeetCode_Daily;
/*You are given a 2D integer array items where items[i] = [pricei, beautyi] denotes the price and beauty of an item respectively.

You are also given a 0-indexed integer array queries. For each queries[j], you want to determine the maximum beauty of an item whose price is less than or equal to queries[j]. If no such item exists, then the answer to this query is 0.

Return an array answer of the same length as queries where answer[j] is the answer to the jth query.*/

import java.util.Arrays;
import java.util.HashMap;

public class MostBeautifulItem {
    public static void main(String[] args) {
        int[][]arr={{1,2},{1,3},{1,4},{1,6},{1,5}};
        int[] queries = {1,2,3,4,5,6};
        MostBeautipul(arr,queries);


    }

    private static void MostBeautipul(int[][] arr,int[]queries) {
        Arrays.sort(arr ,(row1,row2)->Integer.compare(row1[0],row2[0]));


        Max(arr);
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int k=BinarySearch(queries[i],arr);
            ans[i]=arr[k][1];
        }
        System.out.println(Arrays.toString(ans));



    }

    private static int  BinarySearch(int target,int[][]arr) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1; // Holds the index of the largest element less than or equal to the target

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid][0] == target) {
                result = mid; // Update result to the current index
                low = mid + 1; // Continue searching right to find the latest occurrence
            } else if (arr[mid][0] < target) {
                result = mid; // Update result as a potential answer
                low = mid + 1; // Move right to get closer to target or find duplicates
            } else {
                high = mid - 1; // Move left if arr[mid][0] > target
            }
        }

        return result; // Returns the latest row index with value <= target, or -1 if none found

    }

    private static void Max(int [][] arr) {
        int max=arr[0][1];
        for(int i=0;i<arr.length;i++){
            if(arr[i][1]<max){
                arr[i][1]=max;
            }
            else{
                max=arr[i][1];
            }
        }

    }
}
