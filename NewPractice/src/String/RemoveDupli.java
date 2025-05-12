package String;

public class RemoveDupli {
    public static void main(String[] args) {
        System.out.println(RemoveDuplicates("Zoomabaa"));
    }
    private static String RemoveDuplicates(String s){
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(ans.toString().indexOf(s.charAt(i))==-1){
                ans.append(s.charAt(i));
            }

        }
        return ans.toString();
    }
}
