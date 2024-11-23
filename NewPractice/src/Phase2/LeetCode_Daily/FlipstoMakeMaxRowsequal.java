package Phase2.LeetCode_Daily;

import java.util.Arrays;
import java.util.HashMap;

public class FlipstoMakeMaxRowsequal {
    public static void main(String[] args) {
        int[][]arr={{0,0,0},{0,0,1},{1,1,0}};
        System.out.println(CountEqualRows(arr));

    }
    public static int CountEqualRows(int[][]arr){
        HashMap<String,Integer>map=new HashMap<>();
        for(int[]e:arr){
            String s=ConvStr(e);
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }


        }
        int max=0;
        for(int e:map.values()){
            max=Math.max(max,e);
        }
        return max;
    }

    private static String ConvStr(int[] e) {
        StringBuilder sb=new StringBuilder();
        sb.append("1");

        int previous=e[0];

        for(int i=1;i<e.length;i++){
            int present =e[i];
            if(present==previous){
                sb.append("1");

            }
            else{
                sb.append("0");
            }
            previous=present;
        }
        return sb.toString();

    }
}
