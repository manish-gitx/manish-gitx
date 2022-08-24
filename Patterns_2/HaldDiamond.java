package Patterns_2;

import java.util.Scanner;

public class HaldDiamond {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        n=n*2;
        int n1=(n/2)+1;
        int n2=n/2;
        int row=1;
        while(row<=n1){
            int a=1;
            System.out.print("*");
            int num=1;
            int temp=1;
            while(num<=(2*row)-3){
                if(temp>row-1){
                    a=-1;
                    temp=temp-2;}
                System.out.print(temp);
                num=num+1;
                temp=temp+a;
               }
            if(row>1){
                System.out.print("*");
            }
            System.out.println();
            row=row+1;
            
        }
        while(n2>=1){
            int num=1;
            int temp=1;
            int a=1;
            System.out.print("*");
            while(num<=(2*n2)-3){
                if(temp>n2-1){
                    a=-1;
                    temp=temp-2;}
                System.out.print(temp);
                num=num+1;
                temp=temp+a;
            }
            if(n2>1){
                System.out.print("*");
            }
            System.out.println();
            n2=n2-1;
        }
        if(n==0){
            System.out.println("*");
        }
    }
    
}
