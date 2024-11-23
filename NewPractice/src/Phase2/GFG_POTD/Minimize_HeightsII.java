package Phase2.GFG_POTD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Minimize_HeightsII {
    public static void main(String[] args) {
        int arr[] = {3, 9, 12, 16, 20};
        System.out.println(Diference(arr,3));

    }
    public static int Diference(int[]arr,int k){
       Arrays.sort(arr);
       int smallest=arr[0]+k;
       int large=arr[arr.length-1]-k;
       int mi,ma;
       int ans=arr[arr.length-1]-arr[0];
       for(int i=0;i< arr.length;i++){
           mi=Math.min(smallest,arr[i]-k);
           ma=Math.max(large,arr[i]+k);
           if(mi<0){
               continue;
           }
           ans=Math.min(ans,ma-mi);

       }
       return ans;

    }
}
