package Patterns_2;

import java.util.Scanner;

public class MixedPatt {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int rows=in.nextInt();
        int i=1;
        while(i<=rows){
            int spaces=1;
            int num=1;
            while(spaces<=rows-i){
                System.out.print(" ");
                spaces=spaces+1;
            }
            while(num<=i){
                System.out.print(num);
                num=num+1;
            }
            int dec=i-1;//dec=1
            while(dec>=1){//while(dec<=i-1)
                System.out.print(dec);//print(i-dec)
                dec=dec-1;//dec=dec+1
            }
            i=i+1;
            System.out.println();
        }
        in.close();

        
    }
    
    
}
