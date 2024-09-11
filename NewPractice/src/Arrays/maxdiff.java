package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class maxdiff {
    public static void main(String[] args) {
int[]arr1={2,6,3};
int []arr2={11,3,9,7,2};
        System.out.println(fndMax(3,5,arr1,arr2));

    }
    public static long fndMax(int n, int m, int[] arr1, int[] arr2) {
        // code here
        Arrays.sort(arr1);
        Integer[] arr2Integer = Arrays.stream(arr2).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2Integer, Collections.reverseOrder());

        int i=0,j=0;
        int e1=n-1,e2=m-1;
        long sum=0;
        int count=0;
        while(count<n){
            if(Math.abs(arr1[i]-arr2[j])>Math.abs(arr1[e1]-arr2[e2])){
                sum+=Math.abs(arr1[i]-arr2[j]);
                i++;
                j++;
            }
            else{
                sum+=Math.abs(arr1[e1]-arr2[e2]);
                e1--;
                e2--;
            }
            count++;
        }
        return sum;
    }
}
