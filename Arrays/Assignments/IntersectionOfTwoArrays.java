package Arrays.Assignments;
public class IntersectionOfTwoArrays {
    public static void intersections(int arr1[], int arr2[]) {
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0;
		for(int t=0;i<n1;i++){
            int j=t;
            for(j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=0;
                    break;
                }
            }
            
        }
    }
    public static void main(String[] args) {
        int arr1[]={2,6, 1, 2};
        int arr2[]={1 ,2 ,3 ,4 ,2};
        intersections(arr1,arr2);
    }
    	
    }


    

