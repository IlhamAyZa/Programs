package az.aydazade.ilham.ex11;

public class TaylorForSin {

    public static double sinApprox(double x, int numTerms) {
        double solution = 0;
        double eachTerm = 1.0;
        int termsSoFar = 0;
        for (int i = 1; i < (2 * numTerms); ++i) {
            eachTerm *= x / i;
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
}
