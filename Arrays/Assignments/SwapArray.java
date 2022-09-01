package Arrays.Assignments;

public class SwapArray {
    public static void output(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swapAlternate(int arr[]) {
        int n=arr.length;
        if(n%2==0){
            n=n/2;
        }
        else{
            n=(n-1)/2;
        }
        for(int i=0;n>=1;i=i+2,n=n-1){
            int t=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=t;
        }
        output(arr);

    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4 ,5 ,6 ,7 ,8 ,9 ,10, 11};
        swapAlternate(arr);
        

    }
    
}
