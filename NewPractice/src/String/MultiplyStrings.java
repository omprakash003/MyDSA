package String;

import java.math.BigInteger;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(StringMultiplier("-33","00000"));

    }
    private static String StringMultiplier(String s1,String s2){
        Boolean Subraction=false;
        if(s1.charAt(0)=='-') {
            Subraction=!Subraction;
            s1=s1.substring(1);

        }
        if(s2.charAt(0)=='-'){
            Subraction=!Subraction;
             s2=s2.substring(1);
        }

            int i=0;
            while(i<s1.length() && s1.charAt(i)=='0'){
                i++;
            }
        if(i==s1.length()){
            return "0";
        }
        BigInteger n1 = new BigInteger(s1.substring(i));
            int j=0;
            while( j<s2.length() &&s2.charAt(j)=='0' ){
                j++;
            }
            if(j==s2.length()){
                return "0";
            }
         BigInteger n2 = new BigInteger(s2.substring(j));
            BigInteger Multi=n1.multiply(n2);
            if(Subraction){
                return "-"+Multi.toString();
            }
            return Multi.toString();




    }
}
