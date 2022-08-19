package Patterns_1;

import java.util.Scanner;

public class BasicPattern{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(n);
                j=j+1;}
            i=i+1;
            System.out.println();
                }
    in.close();
    }
}