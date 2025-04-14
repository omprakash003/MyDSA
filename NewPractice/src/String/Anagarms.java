package String;

import java.util.HashMap;
import java.util.Locale;

public class Anagarms {
    public static void main(String[] args) {
        String a="anagramm" ;
         String b= "marganaa";
        System.out.println(CheckAnagrams(a.toLowerCase(),b.toLowerCase()));

    }
    public static  String CheckAnagrams(String a,String b){
        HashMap<Character,Integer>map=new HashMap<>();
        for (int i=0;i<a.length();i++){
            if(map.containsKey(a.charAt(i))){
                map.put(a.charAt(i),map.get(a.charAt(i))+1);
            }
            else{
                map.put(a.charAt(i),1);
            }
        }
        for (int i=0;i<b.length();i++){
            if(map.containsKey(b.charAt(i))){
                map.put(b.charAt(i),map.get(b.charAt(i))-1);
                if(map.get(b.charAt(i))==0){
                    map.remove(b.charAt(i));
                }
            }

        }
        if (map.isEmpty()){
            return "Anagrams";
        }
        else{
            return "Not Anagrams";
        }

    }
}
