package String;

public class CheckForBInary {
    public static void main(String[] args) {
        System.out.println(CheckBinary("101"));
    }
    private static boolean CheckBinary(String s){
        int i=0;
        while(i<s.length()&&(s.charAt(i)=='0'||s.charAt(i)=='1')){
            i++;
        }
        return i==s.length();
    }
}
