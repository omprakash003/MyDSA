package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombo {
    public static void main(String[] args) {
Combinations("23");
    }
    public static void Combinations(String digits){
        int[]num=new int[10];

        int start=97;
        for (int i=2;i<=9;i++){
            if(i<7) {
                num[i] = start;
                start = start + 3;
            } else if (i==8) {
                num[i] = start;
                start = start + 3;
            } else{
                num[i]=start;
                start=start+4;
            }
        }
       List<String>list=new ArrayList<>();
        int first=digits.charAt(0)-'0';
        for(int i=0;i<num[first+1]-num[first];i++){
            int asciiValue = num[first]+i; // ASCII value for 'A'
            char character = (char) asciiValue;

            list.add(String.valueOf(character));
        }
        for(int i=1;i<digits.length();i++){
            int n=digits.charAt(i)-'0';
            if(n!=9) {
                for (int j = 0; j < num[n + 1] - num[n]; j++) {
                    int asciiValue = num[n] + j;
                    char character = (char) asciiValue;
                    if(list.size()>j){
                        String s=list.get(j);
                        s+=String.valueOf(character);
                        list.set(j,s);


                    }
                    else{
                        list.add(String.valueOf(character));
                    }


                }
            }
            else{

                for (int j = 0; j < 5; j++) {
                    int asciiValue = num[n] + j;
                    char character = (char) asciiValue;
                    if(list.size()>j){
                        String s=list.get(j);
                        s+=String.valueOf(character);
                        list.add(j,s);

                    }
                    else{
                        list.add(String.valueOf(character));
                    }
                }
            }
        }
        for(String s:list){
            System.out.println(s+" ");
        }



    }
}
