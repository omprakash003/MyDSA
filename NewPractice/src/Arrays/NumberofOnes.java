package Arrays;

public class NumberofOnes {
    public static void main(String[] args) {
        int[]arr={0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(arr));

    }
    public  static int longestSubarray(int[] nums) {
        int low=0,high=0;
        int zerocount=0;
        int maxone=0;
        int count=0;
        while(high<nums.length){
            if(nums[high]==0){
                zerocount++;

            }
            else{
                count++;
            }
            while(zerocount>1){
                if(nums[low]==0){
                    zerocount--;
                }
                else{
                    count--;
                }
                low++;
            }
            maxone=Math.max(maxone,count);
            high++;
        }
        if(zerocount==0){
            return maxone-1;
        }
        return maxone;

    }
}
