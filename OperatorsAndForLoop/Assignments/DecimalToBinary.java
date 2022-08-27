package OperatorsAndForLoop.Assignments;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long sum=0;
        long pw=1;
        for(; n>0; n/=10)
        {
            long last=n%10;
            sum=sum+last*pw;
            pw*=10;
            in.close();
        }
        System.out.println(sum);
    
    }
    
}
