package Patterns_2;
import java.util.Scanner;

public class SumPatt {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int row=1;
        while(row<=n){
            int sum=0;
            int col=1;
            while(col<=row){
                System.out.print(col);
                sum=sum+col;
                if(col==row){
                }
                else{
                    System.out.print("+");
                } 
                col=col+1;
            }
            System.out.print("="+sum);
            System.out.println();
            row=row+1;   }
        in.close();
    }
    
}
