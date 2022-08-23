package Patterns_2;

import java.util.Scanner;

public class TriangleOfNumbers1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int rows=1;
        int inc=1;
        while(rows<=n){
            int spaces=1;
            while(spaces<=n-rows){
                System.out.print(' ');
                spaces=spaces+1; }
                inc=1;
                int temp=rows;
            while(inc<=rows){
                System.out.print(temp);
                temp=temp+1;
                inc=inc+1; }
            int dec=rows-1;
            temp=2*rows-2;
            while(dec>=1){
                System.out.print(temp);
                temp=temp-1;
                dec=dec-1;
            }

            rows=rows+1;
            System.out.println();
         }
         in.close();
    }  

}
