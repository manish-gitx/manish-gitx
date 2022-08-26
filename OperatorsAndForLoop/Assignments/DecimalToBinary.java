package OperatorsAndForLoop.Assignments;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextInt();
        long sum=0;
        for(;n>0; n=n/2){
            long last=n%2;
            System.out.print(last);
            
        }
        
    }
    
}
