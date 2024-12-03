package String;

import java.util.Arrays;

public class LongestSubsequence {
    public static void main(String[] args) {
int m=MaxSubSequence("acd","ced");
        System.out.println(m);
    }
    public static int MaxSubSequence(String s1, String s2){
        int[][]dp=new int[s1.length()][s2.length()];
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }

        return lcsUtil(s1,s2, s1.length()-1,s2.length()-1,dp);
    }
    private static int lcsUtil(String s1, String s2, int ind1, int ind2, int[][] dp) {
        // Base case: If either of the strings reaches the end, return 0
        if (ind1 < 0 || ind2 < 0)
            return 0;

        // If the result for this subproblem has already been calculated, return it
        if (dp[ind1][ind2] != -1)
            return dp[ind1][ind2];

        // If the characters at the current indices are the same, increment the LCS length
        if (s1.charAt(ind1) == s2.charAt(ind2))
            return dp[ind1][ind2] = 1 + lcsUtil(s1, s2, ind1 - 1, ind2 - 1, dp);

            // If the characters are different, choose the maximum LCS length by either
            // skipping a character in s1 or skipping a character in s2
        else
            return dp[ind1][ind2] = Math.max(lcsUtil(s1, s2, ind1, ind2 - 1, dp),
                    lcsUtil(s1, s2, ind1 - 1, ind2, dp));
    }
}
