package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[]arr={"geeksforgeeks", "geeks", "geek", "geezer"};
        LongestPrefix(arr);

    }
    private static void LongestPrefix(String[]arr){
        String smallest="";
        int smallestlength=arr[0].length();
        for(int i=1;i<arr.length;i++){
            if(arr[i].length()<smallestlength){
                smallest=arr[i];
                smallestlength=arr[i].length();
            }
        }
        for(int j=0;j<smallestlength;j++){
            char ch=smallest.charAt(j);
            for(String s:arr){
                if(s.charAt(j)!=ch){
                    System.out.println(smallest.substring(0,j));
                }
            }
        }
    }
}
