package Phase2.GFG_POTD;

import java.util.HashSet;

public class FirstNonRepaeatingChar {
    public static void main(String[] args) {
        String str="uhgxusrtgqitrtpiuqxmpdmyumdputxumlxnrnfwgeuslwdysxhucykkmzfdourroagoan";
       // System.out.println(FirstNonRepeating(str));
       // FirstNonRepeating(str);
//        StringBuilder sb=new StringBuilder("Hello");
//        int m=sb.indexOf(str.substring(0,1));
//        System.out.println(m);
        System.out.println(FirstNonRepeating(str));


    }
    public static char FirstNonRepeating(String s){
        if(s.length()==0||s.length()==1){
            char c=s.charAt(0);
            return c;
        }
        StringBuilder sb=new StringBuilder();
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            int n=sb.indexOf(s.substring(i,i+1));
            if(n==-1){
                sb.append(s.charAt(i));
            }
            else{
                set.add(s.charAt(i));
                sb.deleteCharAt(n);
            }
        }
        if(sb.length()>0){
            for(int i=0;i<sb.length();i++){
                char c=sb.charAt(i);
                if(!set.contains(c)){
                    return c;
                }
            }
        }
        return '$';




    }
}
