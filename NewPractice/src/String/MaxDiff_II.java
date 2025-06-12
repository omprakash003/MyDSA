package String;

import java.util.HashMap;

public class MaxDiff_II {
    public static void main(String[] args) {
        System.out.println(MaxDifference("330",2));

    }
    public static int MaxDifference(String s,int k){
        int i=0;
        int j=k-1;
        int maxDiff=Integer.MIN_VALUE;
        int diff=0;

        while((j-i)>=k-1&& j<s.length()){
            diff=getDifference(s.substring(i,j+1));
            if(diff>maxDiff){
                while(j-i>k){
                    diff=getDifference(s.substring(i,j+1));
                    maxDiff=Math.max(maxDiff,diff);
                    i++;
                }
                if(j==s.length()-1){
                    return maxDiff;
                }
            }
            maxDiff=Math.max(maxDiff,diff);
            j++;

        }
        return maxDiff;

    }
    private static int getDifference(String s){
        int[] freq = new int[10];

        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') freq[c - '0']++;
        }

        int maxOdd = 0, minEven = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            if (freq[i] == 0) continue;
            if (freq[i] % 2 == 1) maxOdd = Math.max(maxOdd, freq[i]);
            else minEven = Math.min(minEven, freq[i]);
        }
        if(minEven==Integer.MAX_VALUE||maxOdd==0){
            return Integer.MIN_VALUE;
        }
        return maxOdd-minEven;
    }
}
