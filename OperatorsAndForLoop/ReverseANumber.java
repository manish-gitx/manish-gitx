package OperatorsAndForLoop;

import java.util.Scanner;



public class ReverseANumber{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        // if(n==0){
        //     System.out.print(n);
        // }
        // for(int a=0; n>0; n=n/10){
        //     a=n%10;
        //     if(a==0){
        //         continue;
        //     }
        //     System.out.print(a);
        // }
         
        int sum=0;
        while(n>0){
            int last=n%10;
            n=n/10;
            sum=sum*10+last;
        }
        System.out.println(sum);
        in.close();
    }
}