package Phase2.LeetCode_Daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class TakeK_of_EachCharacter {
    public static void main(String[] args) {
        String str="aabaaaacaabc";
        System.out.println(MinMinutes(str,2));
        ArrayList<Integer>list=new ArrayList<>();
      

    }
    public static int MinMinutes(String s,int k){
        int del=0;
        char[]arr=s.toCharArray();
        int count_a=0;
        int count_b=0;
        int count_c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'){
                count_a++;
            } else if (arr[i]=='b') {
                count_b++;
            }
            else{
                count_c++;
            }
        }
        if(count_c<k || count_a<k||count_b<k){
            return -1;
        }
        int i=0;int j=0;
        while(j< arr.length){
            if(arr[j]=='a'){
                count_a--;
            } else if (arr[j]=='b') {
                count_b--;
            }
            else if(arr[j]=='c'){
                count_c--;
            }
            while(i<=j && (count_a <k ||count_b<k ||count_c<k) ){
                if(arr[i]=='a'){
                    count_a++;
                } else if (arr[i]=='b') {
                    count_b++;
                }
                else{
                    count_c++;
                }
                i++;

            }
            del=Math.max(del,j-i+1);
            j++;


        }
        return arr.length-del;
    }
}
