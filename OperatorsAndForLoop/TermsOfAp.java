package OperatorsAndForLoop;
import java.util.Scanner;
public class TermsOfAp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            int a= (3*i + 2);
            if(a%4==0){
                n=n+1;
            }
            else{
                System.out.print(a+" ");
            }
        }
    }
    
}
