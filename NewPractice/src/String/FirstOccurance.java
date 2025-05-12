package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstOccurance {
    public static void main(String[] args) {
        System.out.println(FirstOccuredAt( "GeeksForGeeks",  "For"));

    }
    private static int FirstOccuredAt(String pattern,String s){
        if(pattern.equals(s)){
            return 0;
        }

        for (int i = 0; i <pattern.length() ; i++) {
            String sub="";
            for (int j =i ; j <pattern.length() ; j++) {
                sub+=pattern.charAt(j);
                if(sub.equals(s)){
                    return i;
                }

            }
        }
        return -1;
    }
}
