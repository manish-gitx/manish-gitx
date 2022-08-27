package OperatorsAndForLoop.Assignments;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int prev=in.nextInt();
        boolean cond=false;
        boolean inc=false;
        for(;n-1>=1; n=n-1){
            cond=false;
            int last=in.nextInt();
            if(prev==last){
                System.out.println(cond);
                return;
            }
            else if(last<prev){
                cond=true;
                prev=last;
                if(inc){
                    System.out.println("false");
                    return;
                }
            }
            else if(prev<last){
                cond=true;
                inc=true;
                prev=last;

           }
        }
        System.out.println(cond);

    }
    
}
