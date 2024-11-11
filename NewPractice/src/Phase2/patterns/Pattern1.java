package Phase2.patterns;
//Print the pattern
//*****
//*****
//*****

//Rules for pattern printing
//1.Outer loop is for Rows
//2.inner loop is for columns
//3.printing is done in inner for loop
//4.observe symmetry

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("No of rows required..");

        int rows=sc.nextInt();
        System.out.println("No of cols required..");

        int cols=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
