package Patterns_2;

import java.util.Scanner;

public class DiamondOro {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int n1=(n+1)/2;
        int n2=n-n1;
        int row=1;
        while(row<=n1){
            int space=1;
            while(space<=n1-row){
                System.out.print(" ");
                space=space+1;
            }
            int star=1;
            while(star<=(2*row)-1){
                System.out.print("*");
                star=star+1;
            }
            row=row+1;
            System.out.println();
        }
        row=1;
        //row=n2;
        while(n2>=1){//
            int space=1;
            while(space<=row){//(row-n2+1)
                System.out.print(" ");
                space=space+1; }
            int star=1;
            while(star<=(2*n2)-1){
                System.out.print("*");
                star=star+1; }
            n2=n2-1;
            row=row+1;
            System.out.println();
        }
        in.close();   
    }
}
