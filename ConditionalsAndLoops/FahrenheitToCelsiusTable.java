package ConditionalsAndLoops;

import java.util.Scanner;

public class FahrenheitToCelsiusTable {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int start_value = in.nextInt();
        int end_value=in.nextInt();
        int gap_value=in.nextInt();
        while(end_value>=start_value){
            int c = (start_value -32)*5/9;
            System.out.println(start_value+" "+c);
            start_value=start_value+gap_value;


        }
    in.close();
        
    }
    
    
}
