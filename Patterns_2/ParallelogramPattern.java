package Patterns_2;

import java.util.Scanner;

public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int row=1;
        while(row<=n){
            int space=1;
            while(space<=row-1){
                System.out.print(" ");
                space=space+1;
            }
            int star=1;
            while(star<=n){
                System.out.print("*");
                star=star+1;
            }
            row=row+1;
            System.out.println();
        }
        in.close();
    }
    
}
