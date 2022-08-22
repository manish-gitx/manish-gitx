package Patterns_1;



import java.util.Scanner;

public class CharPatt2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            char p=(char)('A'+i-1);
            while(j<=i){
                System.out.print(p);
                p=(char)(p+1);
                j=j+1;
       }
            i=i+1;
            System.out.println();
        }
    in.close();
    }
    
}

