package fundamentals;
import java.util.Scanner;
public class AverageMarks {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name;
        name=s.next();
        char first;
        first=name.charAt(0);
        int a,b,c;
        a=s.nextInt(); 
        b=s.nextInt();
        c=s.nextInt();
        System.out.println(first);
        System.out.println((a+b+c)/3);
        s.close();


        


        
    }
    
}
