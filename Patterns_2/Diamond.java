package Patterns_2;

import java.util.Scanner;

public class Diamond{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int n1=(n+1)/2;
        int ns=n1-1;
        int n2=n-n1;
        int np=1;
        int space=1;
        int stars=1;
        int rows=1;
        while(rows<=n1){
            space=1;
            while(space<=ns){
                System.out.print('_');
                space=space+1;}
                stars=1;
            while(stars<=np){
                System.out.print("*");
                stars=stars+1;
            }
                
        np=np+2;
        rows=rows+1;
        ns=ns-1;
        System.out.println();
    } 
    int i=1;
    np=np-3;
    while(i<=n2){
        space=1;
        while(space<=i){
            System.out.print("_");
            space=space+1; }
        stars=1;
        while(stars<=np){
            System.out.print("*");
            stars=stars+1;
        }
        np=np-4;
        i=i+1;
        System.out.println();

    }

    in.close();
}
}
