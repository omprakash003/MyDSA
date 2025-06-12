package String;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTheNumber {
    public static void main(String[] args) {
        System.out.println(  NotNine("This is alpha 5057 and 97"));

    }
    private static Long NotNine(String s){
        String[]arr=s.split(" ");

        Long ans=-1L;

        for(String a:arr){

            if(a.matches("[0-8]+")){
                if(ans<Long.parseLong(a)){
                    ans=Long.parseLong(a);
                }
            }
        }
        return ans;
    }


}
