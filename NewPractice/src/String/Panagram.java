package String;

import java.util.Collections;

public class Panagram {
    public static void main(String[] args) {
        System.out.println(checkPangram("sdfs"));
    }
    private static boolean ischar(char ch){
        return Character.isLetter(ch);
    }
    public static boolean checkPangram(String s) {
        // your code here

        int [] present=new int[26];
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(ischar(s.charAt(i))){
                int index=s.charAt(i)-'a';
                present[index]=1;
            }
        }
        for (int aBoolean : present) {
            if (aBoolean==0) {

                return false;
            }
        }
        return true;

    }
}
