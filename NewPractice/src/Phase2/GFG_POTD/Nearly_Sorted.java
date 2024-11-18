package Phase2.GFG_POTD;

import java.util.Arrays;

public class Nearly_Sorted {
    public static void main(String[] args) {
        int[]arr={10 ,9, 7, 8, 4, 70, 60, 50};
        System.out.println(Arrays.toString(SortingNearly(arr,4)));

    }
    public static int[]SortingNearly(int[]arr,int k){
        int range=k;

        for(int i=0;i< arr.length;i++){
            int Index=SearchSmall(i,i+k,arr);
            if(Index!=i){
                int temp=arr[i];
                arr[i]=arr[Index];
                arr[Index]=temp;
            }
        }
        return arr;
    }

    private static int SearchSmall(int start, int range, int[] arr) {
        if(range> arr.length-1){
            range= arr.length-1;

        }
        int ans=start;
        for(int j=start;j<=range;j++){
            if(arr[j]<arr[ans]){
                ans=j;
            }
        }
        return ans;
    }
}
