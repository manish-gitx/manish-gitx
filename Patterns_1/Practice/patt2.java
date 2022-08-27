package Practice;
import java.util.Scanner;
public class patt2 {
    public static void main(String[] args) {

    /*
4555
3455
2345
1234 */
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1; i<=n; i++){
            int col=1;
            int temp=n-i+1;
            for(; col<=i; col++){
                System.out.print(temp);
                temp=temp+1;
            }
            int five=n-i;
            for(; five>=1; five--){
                System.out.print("5");
            }
            System.out.println();
            
        }
        in.close();
        
    }
    
}
