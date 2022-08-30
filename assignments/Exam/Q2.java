package Exam;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int num=n;
        int pw=0;
        int sum=1;
        int total=0;
        for(;num>0;num=num/10){
            if(n==0){
                in.close();
                break;
            }
            pw=pw+1;
        }
        //System.out.println(pw);
        num=n;
        for(;num>0;num=num/10){
            int last=num%10;
            int power=pw;
            sum=1;
            for(;power>=1;power--){
                sum=sum*last;

            }
            total=total+sum;
        }
        System.out.println(total);
        if(n==total){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        } 
        in.close();
    }
    
}
