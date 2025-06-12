package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RansomeNote {
    public static void main(String[] args) {
       String ransomNote = "fffbfg", magazine = "effjfggbffjdgbjjhhdegh";
        System.out.println(IsRansome(ransomNote,magazine));
    }
    private static boolean IsRansome(String ransome,String magazine){
        if(ransome.length()==1){
            return magazine.indexOf(ransome)!=-1?true:false;
        }
        StringBuilder sb=new StringBuilder(ransome);
        for(int i=0;i<magazine.length();i++){
            int index= sb.indexOf(String.valueOf(magazine.charAt(i)));
            if(index!=-1){
                sb.replace(index,index+1,"");

            }
        }
        return sb.isEmpty();
    }
}
