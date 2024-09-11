package Arrays;

public class CanPLaceFlowers {
    public static void main(String[] args) {
        int[]arr={0,1,0};
        System.out.println(canPlaceFlowers(arr,1));
    }
    public  static boolean canPlaceFlowers(int[] arr, int n) {
        if(arr.length<2){
            if(n==0 ){
                return true;
            }
            if(n==1 && arr[0]==0){
                return true;
            }
            return false;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(i==0 ){
                if(arr[i]==0 && arr[i+1]==0){
                    arr[i]=1;
                    count++;
                }

            }
            else if(i==arr.length-1){
                if( arr[i]==0&&arr[i-1]==0 ){
                    arr[i]=1;
                    count++;
                }
            }
            else {

                if (i + 1 < arr.length) {
                    if (arr[i] == 0) {
                        if (arr[i - 1] == 0 && arr[i + 1] == 0) {
                            count++;
                            arr[i] = 1;

                        }
                    }
                }
            }
            if(count>=n){
                return true;
            }


        }
        return false;

    }
}
