package String;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "I like this program very much";
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s) {
        // Code here
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        for (int i = arr.length - 1; i > 0; i--) {
            sb.append(arr[i]);
            sb.append(" ");

        }
        sb.append(arr[0]);
        return sb.toString();
    }
}
