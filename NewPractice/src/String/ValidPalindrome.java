package String;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println( CheckPalindrome( ""));

    }
    private static Boolean CheckPalindrome(String s){
        if(s.length()==0){
            return true;
        }
        StringBuilder sb=new StringBuilder("");
        s=s.toLowerCase();

        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        int i=0;
        int j=sb.length()-1;
        while(i<j ){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;



    }
}
