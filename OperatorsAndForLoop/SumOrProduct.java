package OperatorsAndForLoop;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int choice=in.nextInt();
        int sum=1;
        if(choice==1){
            System.out.println((n)*(n+1)/2);
        }
        else if(choice==2){
            for(int i=1; i<=n; i++){
                sum=sum*i;
            }
            System.out.println(sum);
        }
        else{
            System.out.println(-1);}
        
       
        
        in.close();
      
    }
    
}
