package Phase2.LeetCode_Daily;

public class atoi {
    public static void main(String[] args) {
        System.out.println(convertStringtoInt("-42"));
    }
    public static int convertStringtoInt(String str){
        char []ch=str.toCharArray();
        int value=ch[0]-'0';
        char ch1=' ';
        int leading_space=ch1-'0';
        if(value>9){
            return 0;
        }
        int i=0;
        boolean neg=false;

        if(value==leading_space){
            i++;
        }
        if(ch[i]=='-'){
            neg=true;
            i++;
        }
        StringBuilder sb=new StringBuilder();
        if(neg){
            sb.append('-');
        }
        value=ch[i]-'0';
       while(value>=0&&value<=9 ){
           sb.append(value);

           i++;
           if( i<str.length()){
               value=ch[i]-'0';
           }
           else{
               break;
           }

       }
       String ans=sb.toString();
       return Integer.parseInt(ans);
    }
}
