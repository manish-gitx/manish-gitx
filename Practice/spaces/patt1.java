package Practice.spaces;
import java.util.Scanner;
public class patt1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int n1=(n+1)/2;
        int n2=n-n1;
        for(int i=1;i<=n1;i++){
            int col=1;
            for(;col<=n1-i;col++){
                System.out.print("_");
            }
            int stars=2*i-1;
            for(;stars>=1;stars-=1){
                System.out.print("*");
            }
            System.out.println();
        }
        int stars=n;
        for(int i=1;i<=n2;i++){
            stars=stars-2;
            int col=1;
            for(;col<=i;col++){
                System.out.print("_");
            }
            col=1;
            for(;col<=stars;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
