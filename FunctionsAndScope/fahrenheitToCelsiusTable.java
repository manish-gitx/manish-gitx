package FunctionsAndScope;

import java.util.Scanner;

public class fahrenheitToCelsiusTable {
    public static void scale(int start,int end,int step){
        
        for(;start<=end;start=start+step){
            int Value=5*(start-32)/9;
            System.out.println(start+" "+Value);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int s=in.nextInt();
        int e=in.nextInt();
        int g=in.nextInt();
        scale(s,e,g);
        in.close();
    }
}
