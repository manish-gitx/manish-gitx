package Patterns_1;
import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        int i=1;
        while(i<=n){
            int j=i;
            //int p=i;
            while(j>=1){
                System.out.print(j);
                j=j-1;
                //p=p-1;     
       }
            i=i+1;
            System.out.println();
        }
    in.close();
        
    }
    
    
}
