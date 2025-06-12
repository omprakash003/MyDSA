package String;

public class RunLengthEncoding {
    public static void main(String[] args) {
        System.out.println(Encode("aaabbbcccdd"));
    }
    public static String Encode(String s){
       StringBuilder sb=new StringBuilder();
      char match=s.charAt(0);
      int count=1;
        int i=1;
        while(i<s.length()){
            if(s.charAt(i)!=match){
                sb.append(match);
                sb.append(count);
                match=s.charAt(i);
                count=1;
            }
            else{
                count++;
            }
            i++;
        }
        sb.append(match);
        sb.append(count);
        return sb.toString();

    }
}
