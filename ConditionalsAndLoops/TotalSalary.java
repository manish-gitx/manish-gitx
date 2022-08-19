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
        //salary = (int)(salary +0.5);
        System.out.println(Math.round(salary));
        in.close();
    }
    
}
/* t basic = s.nextInt();
char grade = s.next().charAt(0);
double hra = 0.2 * basic;
double da = 0.5 * basic;
int allowance;
if(grade == 'A') {
allowance = 1700;
}
else if(grade == 'B') {
allowance = 1500;
}
else {
allowance = 1300;
}
double pf = 0.11 * basic;
double totalSalary = basic + hra + da + allowance - pf;
int ans = (int) Math.round(totalSalary); //An internal function implemented in the
Math class(no need to import as it is available as default) to round off the decimal values
System.out.println(ans);
 */
