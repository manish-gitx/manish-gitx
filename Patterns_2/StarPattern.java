package Patterns_2;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int rows=in.nextInt();
        int i=1;
        while(i<=rows){
            int spaces=1;
            int stars=1;
            while(spaces<=rows-i){
                System.out.print(" ");
                spaces=spaces+1;
            }
            while(stars<=i){
                System.out.print('*');
                stars=stars+1;
            }
          int dec=i-1;
          while(dec>=1){
            System.out.print('*');
            dec=dec-1;
          }
            i=i+1;
            System.out.println();
        }
        in.close();
        /*import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int currRow = 1;
while(currRow <= n) {
int spaces = 1;
while(spaces <= (n - currRow)) {
System.out.print(" ");
spaces += 1;
}
int currCol = 1;
while(currCol <= (2 * currRow) - 1) {
System.out.print("*");
currCol += 1;
}
System.out.println();
currRow += 1;
}
}
} */

        
    }
    
    
}
