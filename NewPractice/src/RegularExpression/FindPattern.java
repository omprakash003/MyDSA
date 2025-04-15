package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPattern {
    public static void main(String[] args) {
        FindingPattern("ab","abaabbbab");

    }
    private  static void FindingPattern(String pattern,String target){
        Pattern p1=Pattern.compile(pattern);
        Matcher m=p1.matcher(target);
        int count=0;
        while(m.find()){
            count++;
            System.out.println(STR."\{m.start()}---- \{m.end()}---- \{m.group()}");//end is exclusive...
        }
        System.out.println(STR."Count is \{count}");
    }
}
