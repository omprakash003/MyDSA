package Phase2.GFG_POTD;

public class StringRotationOfeachOther {
    public static void main(String[] args) {
String s1 = "abcd", s2 = "cdab";
rotationeachother(s1,s2);
    }
    public static void rotationeachother(String str1,String str2){
        if(str1.length()!=str2.length()){
            System.out.println();
        }
        String temp=str1+str1;
        for(int i=0;i<temp.length();i++){
            int count=0;
            int j=0;
            while(j<str2.length() &&str2.charAt(j)==temp.charAt(i) ){
                count++;
                j++;
                i++;
            }
            if(count==str2.length()){
                System.out.println(true);
            }
        }
        System.out.println(false);
    }
}
