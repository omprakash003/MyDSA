package test;

import java.util.Scanner;

class  Factoriacalculator extends Thread {
    private int number;
    Factoriacalculator(int n){
        this.number=n;

    }


    private long calcualtefactorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*calcualtefactorial(n-1);
        }
    }
    public void run() {
        System.out.println("Thread "+currentThread().getId()+" -factorial of "+number + " is :"+calcualtefactorial(number));
    }
}

public class Threading {
    public static void main(String[] args) {

        int[]numberstocal={0,1,2,3,4};


        for(int number:numberstocal){
            Factoriacalculator fact=new Factoriacalculator(number);
            fact.start();
        }
    }
}


