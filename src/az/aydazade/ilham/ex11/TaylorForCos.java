package az.aydazade.ilham.ex11;

public class TaylorForCos {

    public static double cosApprox(double x, int numTerms) {
        double solution = 1;
        double eachTerm = 1;
        int termsSoFar = 1;
        for (int i = 1; i < (2 * numTerms); ++i) {
            eachTerm *= x / i;
            if (i % 2 == 0) {
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
