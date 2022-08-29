package Exam;

import java.util.Scanner;
   public class Q3 { 
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int star=n;
        for(int i=1;i<=n;i++){
            int col=5;
            int count=1;
            for(;col>=1;col--,count++){
                if(count==star){
                    System.out.print("*");
                }
                else{
                    System.out.print(col);
                }
            }
            star=star-1;
            System.out.println();
        }
        in.close();
    }
    
}
