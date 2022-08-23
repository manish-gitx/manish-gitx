package Patterns_2;

import java.util.Scanner;

public class MirrorPat {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int rows=in.nextInt();
        int i=1;
        while(i<=rows){
            int spaces=1;
            int stars=1;
            while(spaces<=rows-i){
                System.out.print("_");
                spaces=spaces+1;
            }
            while(stars<=i){
                System.out.print("*");
                stars=stars+1;
            }
            i=i+1;
            System.out.println();
        }
        in.close();

        
    }
    
    
}
