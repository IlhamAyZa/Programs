package az.aydazade.ilham.ex1;

import java.util.Scanner;

public class Ex1Main {
    // SIMILARITIES
    
    public static void main(String[] args) {

        Scanner ans = new Scanner(System.in);

        String aString = ans.nextLine();        
        System.out.println(shortestDistance(aString, aString.length()));
    }

    public static int shortestDistance(String string, int length) {

        int minimalDistance = string.length();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (string.charAt(i) == string.charAt(j) && (j - i) < minimalDistance) {
                    minimalDistance = j - i;
                    break;
                }
            }
        }
        if (minimalDistance == string.length()) {
            return -1;
        } else {
            return minimalDistance - 1;
        }
    }
}