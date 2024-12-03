package Phase2.GFG_POTD;

public class MaxCircularSubarray {
    public static void main(String[] args) {
        int[]arr={5,-3,-2,6,-1,4};
        System.out.println(Method2(arr));

    }
    public static int Method1(int[]arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        int total=0;
        for(int i=0;i<arr.length;i++){

            arr[i]=arr[i]*-1;
            total+=arr[i];
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        max=max*-1;
        total=total*-1;
        return total-max;
    }
    public static int Method2(int[]arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int tmax=0;
        int tmin=0;
        int sum=0;
        for(int i=0;i< arr.length;i++){
            tmax+=arr[i];
            tmin+=arr[i];
            sum+=arr[i];
            max=Math.max(max,tmax);
            if(tmax<0){
                tmax=0;
            }
            min=Math.min(min,tmin);
            if(tmin>=0){
                tmin=0;
            }
        }
        if(min==sum){
            return max;
        }
        else{
            return Math.max(max,sum-min);
        }
    }
}
