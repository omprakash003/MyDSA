package Phase2.GFG_POTD;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[]arr={1, 2, 0, 4, 3, 0, 5, 0};
        MoveZerosoptimised(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void MoveZeros(int[]arr){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int j=FindNonZero(i+1,arr.length,arr);
                if(j!=-1){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    private static int FindNonZero(int i, int length, int[] arr) {
        if(i<length){
            for(int j=i;j<length;j++){
                if(arr[j]!=0){
                    return j;
                }
            }
        }
        return -1;
    }
    public static void MoveZerosoptimised(int[]arr){
        int nonZeroIndex = 0; // Pointer to track the position for non-zero elements

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap the current non-zero element with the element at nonZeroIndex
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;

                // Move the nonZeroIndex forward
                nonZeroIndex++;
            }
        }
    }
}

