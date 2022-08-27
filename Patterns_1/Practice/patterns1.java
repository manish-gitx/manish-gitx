package Practice;

import java.util.Scanner;

public class patterns1 {
    /*
A
AB
ABC
ABCD */
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1; i<=n; i++){
            int col=1;
            for(; col<=i; col++){
                char p=(char)('A'+col-1);
                System.out.print(p);
            }
            System.out.println();
        }
        in.close();
        

    }
    
}
