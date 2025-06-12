package String;

import java.util.Arrays;

public class ZigZagConversion {
    public static void main(String[] args) {
ConvertZigZag("PAYPALISHIRING",3);
    }
    private static String ConvertZigZag(String s,int rows){
        if(rows==1){
            return s;
        }
        int []dir={1,-1};
        String []arr=new String[rows];
        Arrays.fill(arr," ");
        int cr=0,i=0,mod=0;
        while(i<s.length()){
            arr[cr]+=s.charAt(i);
            i++;
            int newRow=cr+dir[mod];
            if(newRow<0||newRow>=rows){
                mod=(mod+1)%2;
                newRow=cr+dir[mod];
            }
            cr=newRow;

        }
        String res="";
        for(String j:arr){
            res+=j;
        }
        return res;
    }
}
