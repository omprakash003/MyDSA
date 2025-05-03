package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DifferentCases {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\S");
        Matcher m = p.matcher("abc2 344");
        while (m.find()) {
            System.out.println(m.start()+"---"+m.group());
        }
    }
}
