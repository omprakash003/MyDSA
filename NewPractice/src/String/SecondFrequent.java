package String;

import java.util.Collections;
import java.util.HashMap;

public class SecondFrequent {
    public static void main(String[] args) {
        String arr[] = {"geek", "for", "geek", "for", "aaa", "geek"};
        SecondMostString(arr);

    }
    private static void SecondMostString(String[]arr){
        HashMap<String ,Integer>map=new HashMap<>();
        int maxcount=0;
        String max=arr[0];
        int Secondcount=0;
        String secondmax=arr[0];
       
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
                int count=map.get(arr[i]);
                if(count>maxcount){
                    Secondcount=maxcount;
                    maxcount=count;
                    secondmax=max;
                    max=arr[i];

                }
                else{
                    if(Secondcount<count){
                        Secondcount=count;
                        secondmax=arr[i];
                    }
                }
            }
            else{
                map.put(arr[i],1);
                int count=map.get(arr[i]);
                if(count>maxcount){
                    Secondcount=maxcount;
                    maxcount=count;
                    secondmax=max;
                    max=arr[i];

                }
                else{
                    if(Secondcount<count){
                        Secondcount=count;
                        secondmax=arr[i];
                    }

                }
            }
        }
        System.out.println(secondmax);
    }
}
