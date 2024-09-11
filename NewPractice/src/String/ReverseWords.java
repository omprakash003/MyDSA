package String;

public class ReverseWords {
    public static void main(String[] args) {
        String s="S = i.like.this.program.very.much";
        System.out.println(ReversWords(s));

    }
    public static String ReversWords(String s){
        String[]str=s.split("");
        StringBuilder ans=new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            ans.append(str[i]);
        }
        return ans.toString();
    }
}
