package ConditionalsAndLoops;

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int even=0;
        int odd =0;
        int New=0;
        while(n>0){
            New=n%10;
            if(New%2==0){
                even=even+New;
            }else{
                odd=odd+New;
            }
            n=n/10;
        }
    System.out.println(even+" "+odd);
    in.close();

    }
    
}
