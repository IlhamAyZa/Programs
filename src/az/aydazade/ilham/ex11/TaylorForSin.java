package az.aydazade.ilham.ex11;

import java.util.Scanner;

public class TaylorForSin {

    public static double taylorV1(double a, int numTerms) {
        double solution = 0;
        double eachTerm = 1.0;
        int termsSoFar = 0;

        for (int i = 1; i < (2 * numTerms); ++i) {
            eachTerm *= a / i;
            if (i % 2 != 0) {
                ++termsSoFar;
                if (termsSoFar % 2 == 0) {
                    solution -= eachTerm;
                } else {
                    solution += eachTerm;
                }
            }
        }
        return solution;
    }

    public static double taylorV2(double a, double accuracy){
        double term = a;
        double solution = term;
        int i = 2;
        
        while (Math.abs(term)> accuracy){
            term *= -a / (i * (i+1));
            
            solution += term;
            i += 2;
        }
        
        return solution;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Choose type of path (0/1): ");
        int chooseType = scn.nextInt();  
        if (chooseType == 0) {
            System.out.println("a: ");
            double a = scn.nextDouble();
            System.out.println("numOfTerms: ");
            int number = scn.nextInt();

            System.out.println(taylorV1(a, number));
        } else if (chooseType == 1) {
            System.out.println("a: ");
            double a = scn.nextDouble();
            System.out.println("Enter accuracy: ");
            double accuracy = scn.nextDouble();

            System.out.println(taylorV2(a, accuracy));
        } else {
            System.out.println("You choosed wrong number. Programm will shut down. \n Goodbye");
        }
    }
}
