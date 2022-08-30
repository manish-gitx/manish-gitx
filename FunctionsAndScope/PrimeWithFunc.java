package FunctionsAndScope;

import java.util.Scanner;


public class PrimeWithFunc {
    public static boolean isprime(int n){
        boolean cond=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                cond=false;
                break;
            }
        }
        return cond;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean cond=isprime(n);
        System.out.println(cond);
        in.close();
    }
    
}
