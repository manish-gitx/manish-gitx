package OperatorsAndForLoop.Assignments;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n=in.nextInt();
            int power=0;
            for(;power*power<=n;){
                power++;
            }
            System.out.println(power-1);
            in.close();
        }
    }
}
