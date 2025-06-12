package String;

import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        String s = "abcccccddd";
        System.out.println(longestPalindrome(s));

    }
    public  static int  longestPalindrome(String s) {
        HashMap<Character, Integer>freq=new HashMap<>();
        int hcount=0;
        int scount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq.containsKey(ch)){
                freq.put(ch,freq.get(ch)+1);
            }
            else{
                freq.put(ch,1);
            }
        }
        int count=0;
        Boolean isEven=false;
        for(Character i:freq.keySet()){
            Integer e=freq.get(i);
            System.out.println(i+"-->"+e);
            if(e%2==0){
                count+=e;
            }
            else{
                if(!isEven){
                    isEven=true;
                    count+=e;
                }
                else{
                    count+=e-1;
                }
            }
        }



       return count;


    }


}
