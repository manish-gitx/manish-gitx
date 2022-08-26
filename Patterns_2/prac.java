package Patterns_2;

import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("*");
        for(int i=1; i<=n; i=i+1){
            System.out.print("*");
            int col=1;
            for(; col<=i; col=col+1){
                System.out.print(col);
            }
            int dec=i-1;
            for(; dec>=1; dec=dec-1){
                System.out.print(dec);
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=1; i<=n-1; i=i+1){
            System.out.print("*");
            int col=1;
            for(; col<=n-i; col=col+1){
                System.out.print(col);
            }
            int dec=n-i-1;
            for(; dec>=1; dec=dec-1){
                System.out.print(dec);
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.println("*");

        in.close();
    }
    
}
