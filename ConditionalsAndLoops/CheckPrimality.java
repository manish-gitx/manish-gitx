package ConditionalsAndLoops;

import java.util.Scanner;

public class CheckPrimality {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int i =2;
        while(i<n){
            if(n%i==0){
                System.out.println("composite");
                in.close();
                return;//return statement will return to main so ntg will be excuted
            }
            i=i+1;    
        }
    System.out.println("prime");
    in.close();
    }
    
}
