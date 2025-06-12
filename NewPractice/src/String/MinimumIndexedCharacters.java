package String;

public class MinimumIndexedCharacters {
    public static void main(String[] args) {
        System.out.println(MoreOptimised("geeksforgeeks","get"));
    }
    private static int FindMinString(String s1,String s2){
        if(s1.equals(s2)){
            return 0;
        }


        for(int i=0;i<s1.length();i++ ){
            if(s2.indexOf(s1.charAt(i))!=-1){
                return i;
            }

        }
        return -1;
    }
    private static int MoreOptimised(String s1,String s2){
        boolean[] present = new boolean[256]; // Still O(1) space

        // Preprocess s2 — O(1) if s2.length is small or constant
        for (int i = 0; i < s2.length(); i++) {
            present[s2.charAt(i)] = true;
        }

        // One pass through s1 — O(|s1|)
        for (int i = 0; i < s1.length(); i++) {
            if (present[s1.charAt(i)]) {
                return i;
            }
        }

        return -1;
    }
}
