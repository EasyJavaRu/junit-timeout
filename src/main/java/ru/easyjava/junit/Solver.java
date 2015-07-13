package ru.easyjava.junit;

/**
 * Solves pre-configured equation
 * recursively, using dissection.
 */
public class Solver {
    /**
     * f(x) part of equation
     * f(x)=0.
     * @param x function parameter.
     * @return function value for specified parameter.
     */
    public final double equation(final double x) {
        return 1 / Math.pow(Math.E, Math.log(2.81) * x) + 7.34 * Math.sqrt(x) - 12.6 + 2.9845 * Math.sin(x);
    }

    /**
     * Solves the f(x)=0 equation,
     * where f(x) is equation().
     * @param a beginning of the interval.
     * @param b end of the interval.
     * @param error expected precision value.
     * @return equation root.
     */
    public final double solve(
            final double a,
            final double b,
            final double error) {
        double c = a + ((b - a) / 2);
        double bValue = equation(b);
        double cValue = equation(c);

        if ((b - a) < error) {
            return c;
        }

        if (cValue * bValue < 0) {
            return solve(c, b, error);
        } else {
            return solve(a, c, error);
        }
    }
}
