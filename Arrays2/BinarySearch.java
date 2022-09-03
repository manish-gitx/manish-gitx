package Arrays2;

public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
        int n=arr.length;
        int end=n-1,start=0;
        int mid=(start+end)/2;
        while(start<=end){
            if(arr[mid]<x){
                start=mid+1;
                mid=(start+end)/2;
            }
            else if(arr[mid]>x){
                end=mid-1;
                mid=(end+start)/2;
            }
            else{
                return mid;
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1 ,3 ,7 ,9 ,11 ,12 ,45};
        int x=7;
        int t=binarySearch(arr, x);
        System.out.println(t);
    }
    
}
