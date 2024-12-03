package Phase2.GFG_POTD;

import java.util.ArrayList;

public class Search_pattern {
    public static void main(String[] args) {
String s="geeksforgeeks";
String pat="ee";
PatternFinder(s,pat);
    }
    public static void PatternFinder(String s,String pat){
        int i=0;

        int start=-1;
        int length=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(int j=0;j<s.length();j++){
            if((pat.charAt(i)==s.charAt(j)) && i<pat.length()){
                if(start==-1){
                    start=j;
                }
                length++;
                i++;
                if(length==pat.length()){
                    list.add(start);
                    length=0;
                    start=-1;
                    i=0;
                }


            }
            else{
                i=0;
                start=-1;

            }
        }
        for(Integer e:list){
            System.out.print(e+" ");
        }
    }
}
