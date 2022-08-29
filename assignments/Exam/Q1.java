package Exam;

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            int col=1;
            for(;col<=n;col++){
                if(col==i){
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.print("*");
            col=1;
            for(;col<=n;col++){
                if(col==n-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        in.close();
    }
    
}

