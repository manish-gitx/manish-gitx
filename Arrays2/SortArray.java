public class SortArray {
    public static void selectionSort(int[] arr) {
    	int n=arr.length;
        int i=0;
        while(i<n-1){
            int min=arr[i],j=i+1;
            int index=i;
            while(j<n){
                if(min>arr[j]){
                    min=arr[j];
                    index=j;
                }
                j+=1;
            }            
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
            i+=1;
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
        int arr[]={2 ,13 ,4 ,1 ,3 ,6 ,28};
        selectionSort(arr);
    }
    
    
}
