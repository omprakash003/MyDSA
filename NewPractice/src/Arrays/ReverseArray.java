package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseArray(int arr[]) {
        // code here
        int start=0;
        int end=arr.length-1;
        while(start<end ){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public  static void swap(int[]arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
