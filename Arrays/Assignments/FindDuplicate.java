package Arrays.Assignments;

public class FindDuplicate {
    public static int findUnique(int[] arr){
        int n=arr.length;
        int i=0;
		for(;i<n;i++){
            int j;
            for(j=0;j<n;j++){
                if(j==i){
                    continue;
                }
                else if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
            
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        int arr[]={0, 7 ,2 ,5 ,4 ,7 ,1 ,3, 6};
        int t=findUnique(arr);
        System.out.println(t);

    }
    
}
