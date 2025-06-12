package String;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[]a={9};
       int[]ans=AddOne(a);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] AddOne(int[]arr){
        if(arr[arr.length-1]<9){
            arr[arr.length-1]=arr[arr.length-1]+1;
            return arr;
        }else{
            int carry=0;

                int[]ans=new int[arr.length+1];
                Arrays.fill(ans,0);

                int j=arr.length;
                int i=arr.length-1;
                carry=(arr[i]+1)/10;
                ans[j]=(arr[i]+1)%10;
                i--;
                j--;
                for(int k=j;k>=0;k--){
                    if(i>=0){
                        int add=arr[i]+carry;
                        ans[k]=add%10;
                        carry=add/10;
                        i--;
                    }
                }
                if(carry==1){
                    ans[0]=carry;
                    return ans;
                }
            else{
                int[]ans1=Arrays.copyOfRange(ans,1, ans.length);
                return ans1;

            }

        }
    }
}
