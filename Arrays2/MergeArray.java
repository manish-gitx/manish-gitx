public class array4 {
    
    public static void merge(int arr1[], int arr2[]) {
        int i=0,j=0,k=0;
        int n=arr1.length;
        int n1=arr2.length;
        int arr3[]=new int[n+n1];
        while(i<n && j<n1){
            if(arr1[i]>=arr2[j]){
                arr3[k]=arr2[j];
                j++;
                k++;}
            else{
                arr3[k]=arr1[i];
                i++;
                k++;
            }
        }
        while(j<n1){
            arr3[k]=arr2[j];
            k++;
            j++;
            }
        while(i<n){
            arr3[k]=arr1[i];
            k++;
            i++;
        }
    
        output(arr3);
    }
    public static void output(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
}
    public static void main(String[] args) {
        int arr1[]={1 ,3 ,4 ,7 ,11};
        int arr2[]={};
        merge(arr1, arr2);
    }

}