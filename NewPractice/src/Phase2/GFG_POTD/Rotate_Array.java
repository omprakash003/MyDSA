package Phase2.GFG_POTD;

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[]arr={7, 3, 9, 1};
        RotateArray(arr,9);

        System.out.println(Arrays.toString(arr));
    }
    public static void RotateArray(int[]arr,int k){

        k=k%arr.length;


        reversal(arr,0, arr.length-1);
        reversal(arr,0,k);
        reversal(arr,k+1,arr.length-1);


    }
    public  static void reversal(int[]arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
