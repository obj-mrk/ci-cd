package mrk;

public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int square(int x) {
        return x * x;
    }

    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input");
        int result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }
}
