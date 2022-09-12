package Arrays2.Assignments;

public class PushZerosEnd {
    public static void pushZerosAtEnd(int[] arr) {
        int n=arr.length;
        int z=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                z++;
            }
        }
        for(int i=0,k=0;i<n;i++){
            if(arr[i]!=0){
                arr[k]=arr[i];
                k++;
            }
        }
        for(int i=1;i<=z;i++){
            arr[n-1]=0;
            n--;
        }
        output(arr);
    }
    public static void output(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
}
    public static void main(String[] args) {
        int arr[]={5 ,0 ,7 ,4 ,8 ,1 ,3 ,0 ,7 ,2 ,0  };
        pushZerosAtEnd(arr);
    }
    
}
