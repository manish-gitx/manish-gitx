package Arrays;
import java.util.Scanner;
public class SumOfArr {
    public static int[] input(){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        return arr;
    }
    public static int sum(int[] arr) {
        int total=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=arr[i];
            total=total+sum;
        }
        return total;
	}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=1;i<=t;i++){
            int arri[]=input();
            int total=sum(arri);
            System.out.println(total+"ans");
            in.close();
        }


        
    }

    
}
