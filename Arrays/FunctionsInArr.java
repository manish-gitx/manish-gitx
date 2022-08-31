package Arrays;

import java.util.Scanner;

public class FunctionsInArr {
    public static int[] input(){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("input"+i);
            arr[i]=in.nextInt();
        }
        in.close();
        return arr;
    }
    public static void output(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int brr[]=input();
        output(brr);
    }
    
}
