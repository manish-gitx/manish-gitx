package ConditionalsAndLoops;
import java.util.Scanner;
public class FindPowerOfNum {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        int x = in.nextInt();
        int n=in.nextInt();
        int ans=1;
        while(n>0){     
            ans=x*ans;
            n=n-1;
        }
        System.out.println(ans);
        in.close();
    }
    
}
