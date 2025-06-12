package String;

import java.math.BigInteger;

public class SumOfLargeNumbers {
    public static void main(String[] args) {
        System.out.println(Sum("59479",
                "738"));
    }
    private static String Sum(String s1,String s2){

       StringBuilder ans=new StringBuilder();
       String first=s1.length()>s2.length()?s1:s2;
       String second=s1.length()>s2.length()?s2:s1;
       int i=first.length()-1;
       int j=second.length()-1;
       int carry=0;
       while(j>=0){
           Integer s=second.charAt(j)-'0'+(first.charAt(i)-'0')+carry;
           carry=s/10;
           s=s%10;


           ans.append(s);
           i--;
           j--;

       }
       while(i>=0){
           Integer s=first.charAt(i)-'0'+carry;
           carry=s/10;
           s=s%10;

           ans.append(s);
           i--;
       }
       if(carry>0){
           ans.append(carry);
       }
        return ans.reverse().toString().replaceFirst("^0+(?!$)", "");
    }
}
