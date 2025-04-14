package String;

import java.util.Scanner;

public class ValidUsername {
    public static final String regularExpression="^[a-zA-z][a-zA-Z0-9_]{7,29}";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int n=Integer.parseInt(sc.nextLine());
        while(n!=0){
            String username=sc.nextLine();
            if(username.matches(ValidUsername.regularExpression)){
                System.out.println("Valid");

            }
            else{
                System.out.println("Invalid");
            }
            n--;
        }
        sc.close();



    }





}
