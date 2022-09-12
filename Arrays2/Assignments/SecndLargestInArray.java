public class SecndLargestInArray {
    public static int secondLargestElement(int[] arr) {
        int n=arr.length;
        int min=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                min=max;
                max=arr[i];
            }
            else if(arr[i]>min && arr[i]!=max){
                min=arr[i];
            }
        }
        return min;
    }

    

public static void output(int arr[]){
    int n=arr.length;
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
public static void main(String[] args) {
    int arr[]={28 ,28,28,28,28,28};
    //output(arr);
    int p=secondLargestElement(arr);
    System.out.println(p);
    

}
}
