package Arrays;

public class IncreasingYripletSubSeq {
    public static void main(String[] args) {
int[]arr={109, 262, 93 ,737, 537};
        System.out.println(increasingTriplet(arr));
    }
    public  static boolean increasingTriplet(int[] nums) {
        //int []lis=new int[3];
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int third=-1;
        for(int i=0;i< nums.length;i++){
            if(first>nums[i] && second==Integer.MAX_VALUE){
              first=nums[i];
            }else if(first<nums[i]){
                if(second>nums[i]){
                    second=nums[i];
                }
                else {
                    if(second<nums[i]) {
                        third = nums[i];
                    }
                }
            }
        }
        return !(third==-1);

    }



}
