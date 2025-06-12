package String;

import java.util.HashMap;

public class MostFrequentCharacter {
    public static void main(String[] args) {
MostFrequent("helloweerld");
    }
    private static void MostFrequent(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        char maxChar=s.charAt(0);
        int maxCount=0;
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);

            }
            else{
                map.put(ch,1);
            }
            if(map.get(ch)>maxCount){
                maxCount=map.get(ch);
                maxChar=ch;
            }
            if(map.get(ch)==maxCount &&ch!=maxChar ){
                maxChar=ch-'0'<maxChar-'0'?ch:maxChar;
            }
        }
        System.out.println(maxChar);
    }
}
