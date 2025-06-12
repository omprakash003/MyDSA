package String;

import java.util.HashMap;

public class MaxDiff {
    public static void main(String[] args) {
        System.out.println(maxDifference("tzt"));
    }
    public static int maxDifference(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int Even=Integer.MAX_VALUE;
        int odd=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);

            }
            else{
                map.put(ch,1);
            }
        }
        for(Character ch:map.keySet()){
            if(map.get(ch)%2==0){
                Even=Math.min(Even,map.get(ch));
            }
            else{
                odd=Math.max(odd,map.get(ch));
            }
        }
        return odd-Even;
    }
}
