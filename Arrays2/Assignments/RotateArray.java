package Arrays2.Assignments;

public class RotateArray {
    public static int[] reverse(int[] arr,int d){
        int n=arr.length-d;
        int count =n/2;
        int i=0,l=n-1;
        while(i<count){
            int temp=arr[i];
            arr[i]=arr[l];
            arr[l]=temp;
            i++;
            l--;
        }
        return arr;
    
}

public static void rotate(int[] arr, int d) {
    reverse(arr, 0); 
    reverse(arr, d);
    int n=arr.length;
    int i=n-d;
    int count =d/2;
    while(count>=1){
        int temp=arr[i];
        arr[i]=arr[n-1];
        arr[n-1]=temp;
        i++;
        n--;
        count--;
    }
}
}//                 MENTHOD 2
/*    int n=arr.length-d;
        int count =n/2;
        int i=0,l=n-1;
        while(i<count){
            int temp=arr[i];
            arr[i]=arr[l];
            arr[l]=temp;
            i++;
            l--;
        }
        return arr;
    }

    public static void rotate(int[] arr, int d) {
        reverse(arr, 0); 
        reverse(arr, d);
        int n=arr.length;
        int i=n-d;
        int count =d/2;
        while(count>=1){
            int temp=arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;
            i++;
            n--;
            count--;
        }
    	//Your code goes here
    }

} */
