import java.util.Scanner;
public class Pattern3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int star=1;
        for(int i=1;i<=n-1;i++){
            int col=1;
            for(;col<=n-i+1; col++){
                System.out.print(col);
            }
            if(i>=2){
                star*=2;
                col=1;
                for(;star>=col;col++){
                    System.out.print("*");
                }
            }
            int num=n-i+1;
            for(;num>=1;num-=1){
                System.out.print(num);
            }
            System.out.println();
        }
        in.close();

/*
12344321
123​**​321
12​****​21 */


    }
    
}
