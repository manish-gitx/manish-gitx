package Patterns_1;


import java.util.Scanner;

public class CharPatt {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        int i=1;
        int p=0;
        while(i<=n){
            int j=1;
            //char p=char('A'+i-1)
            while(j<=n){
                char alpha=(char)('A'+j-1+p);//print(p)
                System.out.print(alpha);//p=char(p=p+1)
                j=j+1;
       }
            i=i+1;
            p=p+1;
            System.out.println();
        }
    in.close();
    }
    
}
