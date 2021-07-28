package az.aydazade.ilham.ex12;

import java.util.*;

public class CombinationNK {

    public static double combinationV1(int n, int k) {

        double answer = 1;
        double term = 0;

        double prodNom = 1, prodDenom = 1;

        for (int i = 1; i <= n - k; i++) {
//            term = (n - i + 1) / i;
//            answer *= term;
//            System.out.println("Term #" + i + " term: " + term + " value: " + answer);
//            System.out.println("i: " + i + " nom: " + (n - i + 1) + " denom: " + i);

            prodNom *= (n - i + 1);
            prodDenom *= i;

        }

        answer = prodNom / prodDenom;
        System.out.println("Testing result: " + (prodNom / prodDenom));
        return answer;
    }

    public static double combinationV2(double n, double k) {

        double answer = 1;

        for (int i = 1; i <= n - k; i++) {

            answer *= (n - i + 1) / ((n - k) - i + 1);
//            answer *= ((n - i + 1) / i);

            //System.out.println("Term #" + i + " value: " + answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scn.nextInt();
        System.out.println("Enter k:");
        int k = scn.nextInt();

        Date time1 = new Date();
        double ans1 = combinationV1(n, Math.max(n - k, k));
        Date time2 = new Date();

        System.out.println("First version: " + ans1 + " in time: " + (time2.getTime() - time1.getTime()));

        Date time3 = new Date();
        double ans2 = combinationV2(n, Math.max(n - k, k));
        Date time4 = new Date();

        System.out.println("Second version: " + ans2 + " in time: " + (time4.getTime() - time3.getTime()));
    }

}
