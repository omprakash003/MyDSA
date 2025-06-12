package String;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(Convert("-34435363363737"));
    }
    public static Integer Convert(String n){
        Boolean isNeg=false;
        Boolean NonZero=false;
        StringBuilder sb=new StringBuilder();
        int i=0;
        if(n.charAt(0)=='-'){
            isNeg=true;
            i++;
        }
        for(int j=i;j<n.length();j++){
            if(n.charAt(j)==' '){
                continue;
            }
            if(n.charAt(j)=='0'&& NonZero){
                continue;
            }
            if(!NonZero){
                NonZero=true;
            }
            sb.append(n.charAt(j));
        }
        if(isNeg){
            return -1*Integer.parseInt(sb.toString());
        }
        return Integer.parseInt(sb.toString());
    }
}
