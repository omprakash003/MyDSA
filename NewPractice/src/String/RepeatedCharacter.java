package String;

public class RepeatedCharacter {
    public static void main(String[] args) {
        System.out.println(FirstRepeated("abcde"));
    }
    private static char FirstRepeated(String s){
        String occur="";
        int Index=s.length();
        for(int i=0;i<s.length();i++){
            if(occur.indexOf(s.charAt(i))!=-1){
                Index=Math.min(Index,s.indexOf(s.charAt(i)));
                if(Index==0){
                   return s.charAt(Index);
                }
            }
            else {
                occur+=s.charAt(i);
            }
        }
        if(Index==s.length()){
            return '#';
        }
        return s.charAt(Index);

    }
}
