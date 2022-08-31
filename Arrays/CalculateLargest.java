package Arrays;
import java.util.Scanner;
public class CalculateLargest {
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
public static void main(String[] args) {
    int arr[]=input();
    int n=arr.length;
    int lar=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]>=lar){
            lar=arr[i];
        }

    }
    System.out.println("largest is "+lar);
}
}
