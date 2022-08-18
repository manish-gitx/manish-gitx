package ConditionalsAndLoops;

import java.util.Scanner;


public class EvenOrOdd {
    public static void main(String[] args) {
                         //MENTHOD 1
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        if(n%2==0){
            System.out.println(n+" is a even number");
        }
        
        else{
            System.out.println(n+" is a odd number");

        }
        in.close();
        //                             MENTHOD-2
        // Scanner in=new Scanner(System.in);
        // int n=in.nextInt();
        // int rem;
        // rem=n%2;
        // boolean cond;
        // cond = rem==0;
        // if(cond==true){
        //     System.out.println(n+" is a even number");
        // }else{
        //     System.out.println(n+" is a odd number");
        // }
        // in.close();





    }
    
}
