package az.aydazade.ilham.ex4;

import java.util.Scanner;

public class Ex4Main_v2 {
    
    public static void main(String[] args){
        
        Scanner ans = new Scanner(System.in);
        System.out.println(":");
        int number = ans.nextInt();

        int position = ans.nextInt();
        
        int result = positionOnBits(number, position);
        System.out.println("RESULT: " + result);
        
    }    
    
    public static int positionOnBits( int number, int position ){
        
        number <<= position;
        
        if (number == 0){
            return 0;
        }
        
         
        
        return 0;
    }
}
