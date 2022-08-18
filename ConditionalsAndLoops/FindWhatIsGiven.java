package ConditionalsAndLoops;

import java.util.Scanner;

public class FindWhatIsGiven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String line=in.next();
        char input=line.charAt(0);
        //int b=in.nextInt();
        // if(b==input){
        //     System.out.println("yes");

        // }
        // in.close();
        int i;
        boolean cond;
        cond=false;
        
        if(input>=97)
        {
             i=97;
            while(i<=122){

                if(input==i){
                    System.out.println("0");
                    cond=true;
                }
                i=i+1;
            }
        }
        else if(input<=95){
            i=65;
            while(i<=95){
                if(input==i){
                    System.out.println("1");
                    cond=true;
                }
            i=i+1;
            }
        }
        if(cond==false){
            System.out.println("-1");

        }
        in.close();
        }

        }


/*
 If ch>=‘A’ and ch<=‘Z’:
 print(1)
If ch>= ‘a’ and ch<=‘z’:
 print(0)
Else:
 print(-1)
 
 */

    
