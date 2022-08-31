package Arrays;

import java.util.Scanner;

public class BasicArray{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<=n-1;i++){
            System.out.println("input "+i);
            arr[i]=in.nextInt();
            
        }
        for(int i=0;i<=n-1;i++){
            System.out.println(arr[i]);
        }
        in.close();
       
    }
}