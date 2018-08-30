package es.jfcorugedo;

/**
 * Basic calculator
 *
 */
public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int mod(int a, int b) {
        return a % b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int random() {
        return (int) (MathUtility.random() * 100);
    }

    public int computeMagicNumber() {
        return new MathUtility().computeSpecialNumger(100);
    }
}
