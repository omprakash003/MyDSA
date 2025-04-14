package Arrays;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;

public class QSC2 {
    public static void main(String[] args) {
        String str[]=new String[3];
        str[0]="1 2 98";
        str[1]="99 100 10";
        str[2]="1 2 30";
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<str.length;i++){
            take(str[i].split(" "),map,2);
        }


    }
    public static void take(String []str, HashMap<Integer,Integer>map,int threshold){

        for (int i = 0; i <str.length ; i++) {
            int a=Integer.parseInt(str[i]);
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);

            }
            else{
                map.put(a,1);
            }
        }
        for(int e:map.keySet()){
            if(map.get(e)>=threshold){
                System.out.println(e);
            }
        }
    }


}
