package String;

class Solution {
    public static void main(String[] args) {
        String s = "bb";
        System.out.println(longestPalindrome(s));

    }
    public  static String longestPalindrome(String s) {
        String ans=String.valueOf(s.charAt(0));
        int low=0,high=1;
        for(int i=0;i<s.length()-1;i++){
            int left=i;
            int right=i;
            while((left >=0&&right<s.length())&&s.charAt(left)==s.charAt(right)){
                if(right-left>ans.length()){
                   ans= s.substring(left,right+1);
                }


                left--;
                right++;
            }
            left=i;
            right=i+1;
            while((left >=0&&right<s.length())&&s.charAt(left)==s.charAt(right)){
                if(right-left>ans.length()){
                    ans= s.substring(left,right+1);
                }

                left--;
                right++;
            }
        }



        return ans;


    }


}
