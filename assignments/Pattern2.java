import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("1");
        int zero=1;
        
        for(int i=1;i<=n-1;i++){
            int num=1;
            System.out.print(i);
            if(i>=2){
                for(;zero>=num;num++){
                    System.out.print("0");
                }
                zero=zero+1;
            }
            System.out.print(i);
            System.out.println();
        }  
        in.close();
    }
    
}