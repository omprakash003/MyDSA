package Phase2.LeetCode_Daily;

import java.util.HashMap;

public class ShortestSubarry_862 {
    public static void main(String[] args) {
        int[]arr={2,-1,2};
        System.out.println(ShortestSubarraySize(arr,3));

    }
    public static int ShortestSubarraySize(int[]arr,int k){
        int ans=arr.length-1;
        HashMap<Integer,Integer> Map=new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            Map.put(i,sum);
            int si=Find(Map,sum-k);
            if(si!=-1 && ans>i-si){
                ans=i-si;
            }


        }
        return ans;

    }

    private static int Find(HashMap<Integer, Integer> map, int si) {
        for(Integer e:map.keySet()){
            if(map.get(e)<=si){
                return e;
            }
        }
        return -1;
    }
}
