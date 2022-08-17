package fundamentals;

public class ArithemeticOperators {
    public static void main(String[] args) {
        /* so the arethemetic operators follow bodmas rule but for both multiplication
         * division are same priority so it calculate from left to right for it
         */
        int a,b;
        a=5;
        b=2;
        System.out.println(a+b*2);
        System.out.println("Above case b*2 is done and then added to  int a,so the ans is 9");
        System.out.println((a+b)*2);
        System.out.println("Here we used brackets so a+b is done and multiplied to 2 so ans is 14");
        System.out.println(a/b*b);
       System.out.println("Multiplicationa and diviosn have same priority so calculated from left to right so ans will be 4");
       float c,d;
       c=5;
       d=2;
       System.out.println(c/d);
        System.out.println("We used same data type and ans is in the same data type form");

        
    }
    
}
