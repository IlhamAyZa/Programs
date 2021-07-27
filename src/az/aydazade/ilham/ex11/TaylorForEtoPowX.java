package az.aydazade.ilham.ex11;

import java.util.Scanner;

public class TaylorForEtoPowX {

    public static double taylor(double x, double accuracy) {

        double term = 1;
        double total = 1;
        int idx = 1;

        while (term > accuracy) {

            term *= x / idx;
            System.out.println("Term " + idx + " :" + term);
            total += term;
            System.out.println("TOTAL: " + total);
            idx++;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("x: ");
        double a = scn.nextDouble();
        System.out.println("Enter accuracy: ");
        double accuracy = scn.nextDouble();
        
        System.out.println(taylor(a, accuracy));
    }
}
