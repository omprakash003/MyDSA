package Phase2;

public class Fibo {
    public static void main(String[] args) {
        int m=6;
        int a1=0;
        int a2=1;
        int count=1;
        int sum=0;
        for(int i=2;i<=m;i++ ){
            sum=a1+a2;
            a1=a2;

            a2=sum;
        }
        System.out.println(sum);
    }

}
