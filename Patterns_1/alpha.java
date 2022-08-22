package Patterns_1;

/* A
 BB
 CCC*/


import java.util.Scanner;

public class alpha {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                char alpha=(char)('A'+i-1);
                System.out.print(alpha);
                j=j+1;
       }
            i=i+1;
            System.out.println();
        }
    in.close();
    }
    
}
