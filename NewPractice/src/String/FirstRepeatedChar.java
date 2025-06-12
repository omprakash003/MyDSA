package String;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        System.out.println(FirstRep("hogeks"));
    }
    private static String FirstRep(String s){
        String occurs="";
        for(int i=0;i<s.length();i++){
            if(occurs.indexOf(s.charAt(i))!=-1){
                return s.substring(i,i+1);
            }
            else{
                occurs+=s.charAt(i);
            }
        }
        return "-1";
    }
}
