package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GroupAnanagrams {
    public static void main(String[] args) {
String arr[] = {"act", "god", "cat", "dog", "tac"};
anagrams(arr);

    }
    private static void anagrams(String[]arr){
       ArrayList<ArrayList<String>> ans = new ArrayList<>();
       for(int i=0;i< arr.length;i++){
           ArrayList<String> list=new ArrayList<>();
           char[]key;
           if(arr[i]!="") {
               list.add(arr[i]);
                key = arr[i].toCharArray();

               Arrays.sort(key);
           }
           else{
               continue;
           }
           for(int j=i+1;j<arr.length;j++){
               char[]val=arr[j].toCharArray();
               Arrays.sort(val);
               String key1= Arrays.toString(key);
               String val1= Arrays.toString(val);
               if(key1.equals(val1)){
                   list.add(arr[j]);
                   arr[j]="";
               }

           }
           ans.add(list);
       }


    }
}
