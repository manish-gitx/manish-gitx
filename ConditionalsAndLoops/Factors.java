package ConditionalsAndLoops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        int i =2;
        while(i<n){
            if(n%i==0){
                System.out.print(i+" ");
            }
        i=i+1;
        }
    in.close();
    }
    
}
