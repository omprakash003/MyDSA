package Phase2.GFG_POTD;

public class Implement_Atoi {
    public static void main(String[] args) {
        String s="-999999999999";
        System.out.println( StringReturn(s));

    }
    public static int StringReturn(String s){
        char[]str=s.toCharArray();
        int i=0;
        double max=Math.pow(2,31)-1;
        while(str[i]==' '){
            i++;
        }
        String s1=s.substring(i,s.length());
        int negative=1;
        if(str[i]=='-'){
            negative=-1;
            i++;
        }
       long ans=0;
        int j=i;
        while(j<s.length()){
            int c=str[j]-'0';

            if(c>10){
                break;
            }
            ans=ans*10+str[j]-'0';
            if(ans>Integer.MAX_VALUE){
                return (int)max;
            }
            j++;
        }
        return (int) ans*negative;

    }
}
