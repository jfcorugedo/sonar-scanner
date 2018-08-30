package es.jfcorugedo;

public class MathUtility {

    public int computeSpecialNumger(int a) {
        return (int) (Math.random() * 100 + a);
    }

    public static double random() {
        return Math.random();
    }
}
