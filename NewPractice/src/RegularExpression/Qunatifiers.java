package RegularExpression;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qunatifiers {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("a?");
        Matcher m=p.matcher("abaaabcba");
        while(m.find()){
            System.out.println(m.start());
        }
        String s="Hello this is java programming language";
        String[]s1=s.split("");
        for(String s2:s1){
            System.out.print(s2);
            System.out.println();
        }

    }
}
