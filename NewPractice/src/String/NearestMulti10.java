package String;

import java.math.BigInteger;

import static String.NearestMulti10.addOne;

public class NearestMulti10 {
    public static void main(String[] args) {
        System.out.println(NearestMultipleOf10("35"));
    }
    private static String NearestMultipleOf10(String n){
        int len = n.length();
        char lastDigit = n.charAt(len - 1);

        if (lastDigit == '0') {
            return n;
        }

        // Get prefix without the last digit
        String prefix = n.substring(0, len - 1);
        int digit = lastDigit - '0';

        // First candidate: prefix + "0"
        String lower = prefix + "0";

        // Second candidate: increment prefix and append "0"
        String higher = addOne(prefix) + "0";

        int diffToLower = digit;
        int diffToHigher = 10 - digit;

        // Choose the closer one
        return (diffToLower <= diffToHigher) ? lower : higher;
    }

    // Helper function to add 1 to a numeric string
    static  String  addOne(String num) {
        StringBuilder sb = new StringBuilder();
        int carry = 1;

        for (int i = num.length() - 1; i >= 0; i--) {
            int sum = (num.charAt(i) - '0') + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }

        if (carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }




}
