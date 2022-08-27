package OperatorsAndForLoop.Assignments;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int power=0;
        int i=1;
        for(; power<=n; i++){
            power=i*i;
            in.close();
            if(power==n){
                System.out.println(i);
                return;
            }
            else if(power>n){
                System.out.println(i-1);
                return;
            }
        }
    }
    
}
