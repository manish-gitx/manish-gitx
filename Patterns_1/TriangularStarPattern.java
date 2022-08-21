package Patterns_1;

import java.util.Scanner;

public class TriangularStarPattern {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            //int p=n;
            while(j<=i){
                System.out.print("*");
                j=j+1;
                //p=p-1;     
       }
            i=i+1;
            System.out.println();
        }
    in.close();
    }
    
}
