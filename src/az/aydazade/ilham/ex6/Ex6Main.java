package az.aydazade.ilham.ex6;

import java.util.Scanner;

public class Ex6Main {
    
    public static void main(String[] args) {
        Scanner ans = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int number = ans.nextInt();
        
        System.out.print("Enter index of bit: ");
        int pos = ans.nextInt();
        
        System.out.print("Enter 1 / 0 :");
        int chgBit = ans.nextInt();
        
        int res = changeBit(number, pos, chgBit);
        
        System.out.println("Result: " + res);
    }
    
    public static int changeBit( int num, int pos , int chgBit){
    
        int mask = 1 << pos;
        return (num & ~mask) | ((chgBit << pos) & mask);
        
    }
}
