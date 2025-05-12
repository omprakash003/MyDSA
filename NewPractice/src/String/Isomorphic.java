package String;

import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic {
    public static void main(String[] args) {
        System.out.println(IsIsomorphic("yktbvpmxnuo","murlidsaris"));
    }
    private static boolean IsIsomorphic(String s1,String s2){
        if (s1.length() != s2.length()) {
            return false; // Strings must be of the same length
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> usedValues = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            char charS1 = s1.charAt(i);
            char charS2 = s2.charAt(i);

            // Check if charS1 has been mapped before
            if (map.containsKey(charS1)) {
                if (map.get(charS1) != charS2) {
                    return false; // Inconsistent mapping
                }
            } else {
                // Check if charS2 has already been used
                if (usedValues.contains(charS2)) {
                    return false; // Multiple characters in s1 mapping to the same character in s2
                }

                // Map charS1 to charS2 and mark charS2 as used
                map.put(charS1, charS2);
                usedValues.add(charS2);
            }
        }

        return true;
    }
}
