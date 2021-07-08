package az.aydazade.ilham.ex5;

import java.util.Scanner;

public class Ex5Main {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int a = scn.nextInt();
        int b = scn.nextInt();
        
        System.out.println("A = "+a+" B = "+b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After swap : \n  A = " + a + " B = "+b);
                
    }
}
