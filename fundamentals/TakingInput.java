package fundamentals;
import java.util.Scanner;
public class TakingInput {
    

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in); //s.nextLine will fetch whole line
        /*
        stri=s.next();
        System.out.println(stri);
        */
        
        String stri;
        stri=s.next();
        char ch=stri.charAt(0);
        System.out.println(ch);



        //float a,b,c;
        // int a,b,c;
        // a=s.nextInt(); 
        // b=s.nextInt();
        // c=s.nextInt();
        // System.out.println(a +""+b +""+c);
        s.close();

        //b1=s.nextBoolean

        // a=s.nextFloat();
        // b=s.nextFloat();
        // c=a+b;
        // System.out.println(c);




        
    }
    
 } 