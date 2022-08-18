package ConditionalsAndLoops;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
       if(a>b){
        System.out.println(a+" is greater than "+b);
       }else{
        if(a<b){
            System.out.println(b+" is greater than "+a);

        }else{
            System.out.println(a+" is equal to "+b);
        }
        in.close();

        }
       }
}
