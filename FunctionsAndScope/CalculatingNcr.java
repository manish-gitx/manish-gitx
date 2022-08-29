package FunctionsAndScope;

import java.util.Scanner;

public class CalculatingNcr {
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int r=in.nextInt();
        int factn=factorial(n);
        int factr=factorial(r);
        int factnr=factorial(n-r);
        int ans=factn/(factr*factnr);
        System.out.println(ans);
        in.close();

    }
}
