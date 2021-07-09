package az.aydazade.ilham.ex7;

import java.util.Scanner;
import java.lang.Math;

public class Ex7Main {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        
        System.out.println(getRoots(a ,  b,  c));

    }
    
    public static String getRoots(int a , int b, int c){
        
        float discriminant = (b * b) - (4 * a * c)  ;
        
        if (discriminant == 0) {
            // one root
                        
            float root = (- b) / (2 * a);
            
            return "There are only one root for the following quadratic equation: " + root ;
        }
        
        else if (discriminant > 0){
            // two roots
                        
            double root1 = (- b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (- b - Math.sqrt(discriminant)) / (2 * a);
            
            return "There are two roots for the following quadratic equation: " + root1 + " and "+ root2;
        }
        
        else{
            // no roots
            return "There are no roots for such quadratic equarion";
        }
    }
    
}
