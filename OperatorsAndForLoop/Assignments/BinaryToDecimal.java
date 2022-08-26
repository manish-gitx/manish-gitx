package OperatorsAndForLoop.Assignments;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int power=1;
        int digi=0;
        while(n>0){
            int last=n%10;
            digi=digi+last*power;
            power*=2;
            n=n/10;
        }
        System.out.println(digi);
        in.close();
        // int t=0;
        // for(int a=0,i=0; n>0; n=n/10,i=i+1){
        //     a=n%10;
        //     if(a==0){
        //         continue;
        //     }
        //     int temp=i;
        //     int sum=1;
            
        //     for(;temp>=1; temp=temp-1){
        //         sum=sum*2;
        //     }
        //     t=t+sum;
        
            
        // }
        // System.out.println(t);
             
    }
    


        }
    
