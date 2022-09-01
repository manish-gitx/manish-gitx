package Arrays;
import java.util.Scanner;
public class LinearSearch {

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
    public static int linearSearch(int arr[], int x) {
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int arr[]=input();
        int ans=linearSearch(arr, x);
        System.out.println(ans);
        in.close();
    }
}

    

