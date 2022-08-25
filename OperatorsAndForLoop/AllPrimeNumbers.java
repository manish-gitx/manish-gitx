package OperatorsAndForLoop;

import java.util.Scanner;

public class AllPrimeNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=2; i<=n; i++){
            int prime=2;
            boolean flag=true;
            for(; prime<i; prime++){
                if(i%prime==0){
                    flag=false;
                    break;
                }}
            
            if(flag==true){
                System.out.println(prime);
            }
        }


        }
    }
    

