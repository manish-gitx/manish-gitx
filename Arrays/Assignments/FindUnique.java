package Arrays.Assignments;

public class FindUnique {
    public static int findUnique(int[] arr){
        int n=arr.length;
        int i=0;
		for(;i<n;i++){
            int j;
            boolean cond=true;
            for(j=0;j<n;j++){
                if(j==i){
                    continue;
                }
                else if(arr[i]==arr[j]){
                    cond=false;
                }
            }
            if(cond){
                return arr[i];

            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        int arr[]={2, 4, 7, 2, 7};
        int t=findUnique(arr);
        System.out.println(t);

    }
    
}
