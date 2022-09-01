package Arrays.Assignments;
public class TripleSum {
    public static int findTriplet(int[] arr, int x) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int j=i+1;
            for(;j<n;j++){
                int k=j+1;
                for(;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        sum=sum+1;
                    }
                }
            }
        }
        return sum;
    	//Your code goes here
    }

    public static void main(String[] args) {
        int arr[]={1 ,2 ,3 ,4 ,5 ,6 ,7 };
        //int arr[]={2 ,-5 ,8 ,-6 ,0 ,5 ,10 ,11 -3};

        int x=12;
        double sum=findTriplet(arr, x);
        System.out.println(sum);
    
    }

    
}
