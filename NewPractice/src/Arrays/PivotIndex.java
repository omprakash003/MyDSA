package Arrays;

public class PivotIndex {
    public static void main(String[] args) {
        int[]arr={1,7,3,6,5,6};
        System.out.println(PivoitIndexReturn(arr));

    }
    public static int PivoitIndexReturn(int[]arr){
        int right;
        int left=0;
        int Sum=Sum(arr);
        int high= arr.length-1;
        for(int i=0;i<=high;i++){
            right=Sum-arr[i]-left;
            if(left==right){
                return i;
            }
            left+=arr[i];
        }
        return -1;
    }
    public static int Sum(int []arr){
        int sum=0;
        for(int e:arr){
            sum+=e;
        }
        return sum;
    }
}
