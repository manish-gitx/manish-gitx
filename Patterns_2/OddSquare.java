package Patterns_2;
import java.util.Scanner;
public class OddSquare {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        int row=1;
        while(row<=n){
            int temp=(2*row)-1;
            int col=1;
            while(col<=n){
                if((n*2)-1<temp){
                    temp=1;}
                System.out.print(temp);
                col=col+1;
                temp=temp+2;
       }
            row=row+1;
            System.out.println();
        }
    in.close();
    }
    
}
