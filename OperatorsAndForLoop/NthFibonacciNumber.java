package OperatorsAndForLoop;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        int a=0;
        int b=1;
        for(int i=1; i<=n; i++){
            sum=a+b;
            b=a;
            a=sum;
        }
        System.out.println(sum);
        in.close();
    }
    
}
