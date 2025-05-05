package String;

public class LongestCommonSubString {
    public static void main(String[] args) {
        System.out.println(CommonSubstring("ACB","ACB"));

    }
    private static String CommonSubstring(String s1,String s2){
        if (s1.isEmpty()||s2.isEmpty()){
           return "";
        }
        if(s1.equals(s2)){
            return s1;
        }
        String ans="";
        for(int i=0;i<s1.length();i++){
            int p1=i;
            String substring="";
            for (int j=0;j<s2.length();j++){
                int p2=j;
                while( p1<s1.length() &&p2<s2.length() && s2.charAt(j)==s1.charAt(p1) ){
                    substring+=s2.charAt(j);
                    p1++;
                    p2++;

                }
                if(substring.length()>ans.length()){
                    ans=substring;
                }
            }

        }
       return  ans;
    }
}
