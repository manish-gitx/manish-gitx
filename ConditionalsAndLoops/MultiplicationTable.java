package ConditionalsAndLoops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int i=1;
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        while(i<=10){
            System.out.println(i*n);
            i=i+1; 
        }
        in.close();
        
    }
}
