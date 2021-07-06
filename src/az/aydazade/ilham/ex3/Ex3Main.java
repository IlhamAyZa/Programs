package az.aydazade.ilham.ex3;

import java.util.Scanner;

public class Ex3Main {
    
    public static void main(String[] args) {
        Scanner ans = new Scanner(System.in);

        int number = ans.nextInt();

        int result = reverseBits(number);
        System.out.println("Result = " + result);
    }

    public static int reverseBits(int number){
        
        int reverse = 0;
 
        while (number > 0){
            
            // reverce = reverce << 1 ;
            reverse <<= 1;
 
            if ((int)(number & 1) == 1){
                // reverce = reverce ^ 1; // or
                reverse ^= 1;
            }
 
            // number = number >> 1 ;
            number >>= 1;
        }
        
        return reverse;
    }
}
