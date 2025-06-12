package String;

public class FirstUniqueChar {
    public static void main(String[] args) {
        System.out.println(FirstUnique("leetlcode"));
    }
    public static int FirstUnique(String s){
        if(s.length()==1){
            return 1;
        }
        if(s.length()==2){
            if(s.charAt(1)!=s.charAt(0)){
                return 0;
            }
            return -1;
        }
        int []occureed=new int[256];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            occureed[ch-'0']=occureed[ch-'0']+1;

        }
        for(int i=0;i<s.length();i++){
            if(occureed[s.charAt(i)-'0']==1){
                return i;
            }
        }
        return -1;
    }
}
