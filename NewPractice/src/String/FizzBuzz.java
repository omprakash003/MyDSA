package String;

import java.util.ArrayList;
import java.util.List;

/*
Problem
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        List<String>ans=fizzbuzz(15);
        for (String e:ans){
            System.out.print(e+" ");
        }

    }
    public static List<String> fizzbuzz(int n){
        List<String>ans=new ArrayList<>();
        String fizz="Fizz";
        String fizzbuzz="FizzBuzz";
        String buzz="Buzz";
        for(Integer i=1;i<=n;i++){
            if(i%3==0){
                if(i%5==0){
                    ans.add(fizzbuzz);
                    continue;
                }
                ans.add(fizz);
            }
            else if (i%5==0){
                ans.add(buzz);
            }
            else{
                ans.add(i.toString());
            }
        }
        return ans;
    }
}
