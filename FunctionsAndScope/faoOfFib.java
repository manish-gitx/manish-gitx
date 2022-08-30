package FunctionsAndScope;

import java.util.Scanner;

public class faoOfFib {
    public static boolean checkMember(int n){
        int a=0;
        int b=1;
        int sum=0;
        boolean cond=false;
        for(;sum<=n;){
            if(sum==n){
                cond=true;
                break;
                
            }       
            sum=a+b;
            b=a;
            a=sum;   
        }
        return cond;
	}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       boolean h= checkMember(n);
       System.out.println(h);
    
        in.close();

    }
}
