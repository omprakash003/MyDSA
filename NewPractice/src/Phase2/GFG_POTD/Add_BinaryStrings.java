package Phase2.GFG_POTD;

public class Add_BinaryStrings {
    public static void main(String[] args) {
        String s1="1011001", s2 = "111010";
        BinaryAddition(s1,s2);

    }
    public static void Addition(String s,String s1){

        int m=s.length()-1;
        int n=s1.length()-1;
        int i=m;
        int j=n;
        int carry=0;
        int Tdigits=0;
        int ans=0;

        while(i>=0 && j>=0){
            int c1=s.charAt(i)-'0';
            int c2=s1.charAt(j)-'0';
            int sum=c1+c2+carry;
            int digit=0;
            if(sum==2){
                ans*=10;
                carry=1;

            }
            else if(sum==3){

                    ans=ans*10+1;
                    carry=1;
                }
            else{
                ans=ans*10+sum;
            }
            Tdigits++;
            i--;
            j--;
        }
        while(i>=0){
            int c1=s.charAt(i)-'0';
            int sum=c1+carry;
            if(sum==2){
                ans*=10;
                carry=1;
            }
            Tdigits++;
            i--;
        }
        while(j>=0){
            int c1=s1.charAt(j)-'0';
            int sum=c1+carry;
            if(sum==2){
                ans*=10;
                carry=1;
            }
            Tdigits++;
            j--;
        }
        StringBuilder sb=new StringBuilder();
        if(carry!=0){
            sb.append(carry);
            Tdigits--;

        }
        sb.append(ans);





        while(Tdigits>0){
            sb.append(0);
            Tdigits--;
        }
        System.out.println(sb.toString());
    }

    //My Own Code 
    public static void BinaryAddition(String s1,String s2){
        int m=s1.length()-1;
        int n=s2.length()-1;
        StringBuilder sb=new StringBuilder();
        int c1=0;
        int c2=0;
        int carry=0;
        while(m>=0 && n>=0){
            c1=s1.charAt(m)-'0';
            c2=s2.charAt(n)-'0';
            int sum=c1+c2+carry;
            if(sum==2){
                sb.append(0);
                carry=1;
            }
            else if(sum==3){
                sb.append(1);
                carry=1;
            }
            else{
                sb.append(sum);
                carry=0;
            }
            m--;
            n--;
        }
        while(m>=0){
            c1=s1.charAt(m)-'0';
            int sum=c1+carry;
            if(sum==2){
                sb.append(0);
                carry=1;
            }
            else{
                sb.append(sum);
                carry=0;
            }
            m--;
        }
        while(n>=0){
            c1=s2.charAt(n)-'0';
            int sum=c1+carry;
            if(sum==2){
                sb.append(0);
                carry=1;
            }
            else{
                sb.append(sum);
                carry=0;
            }
            n--;
        }
        if(carry>0){
            sb.append(carry);
        }
        sb.reverse();
        int i=0;
        while(sb.charAt(i)=='0'){
            sb.deleteCharAt(i);

        }
        System.out.println(sb.toString());
    }
}
