package String;

public class FindCharsequence {
    public static void main(String[] args) {
String haystack = "leetcode", needle = "leeto";
FindStart(haystack,needle);
    }
    private static void FindStart(String haystack,String needle){
        if(haystack.equals(needle)){
            System.out.println(0);
        }
        int start=0;
        int end=needle.length()-1;
        while(end<haystack.length()){
            String match=haystack.substring(start,end+1);
            if(match.equals(needle)){
                System.out.println(start);
                return;
            }
            start++;
            end++;
        }
        System.out.println(-1);

    }
}
