package ConditionalsAndLoops;

import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int basic=in.nextInt();
        String input=in.next();
        char alpha=input.charAt(0);
        int allow=1700;
        double hra,da,pf;
        int a=1300;
        int i='A';
        while(i<='C'){
            if(alpha==i){
                a=allow;
            }
        allow=allow-200;
        i=i+1;
        }
        hra=(20/100.0)*basic;
        da=(50/100.0)*basic;
        pf=(11/100.0)*basic;
        double salary=basic+hra+da+a-pf;
        salary = (int)(salary +0.5);
        System.out.println(salary);
        in.close();
    }
    
}
