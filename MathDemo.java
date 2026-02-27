public class MathDemo {

    public static int min(int a, int b) {
        if (a < b) return a;
        return b;
    }

    public static int max(int a, int b) {
        if (a > b) return a;
        return b;
    }

    public static int sum(int[] args) {
        int s = 0;
        for (int i = 0; i < args.length; i++) {
            s += args[i];
        }
        return s;
    }

    public static float mean(int[] args) {
        if (args.length == 0) return 0;
        return (float) sum(args) / args.length;
    }

    public static int factorial(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r *= i;
        }
        return r;
    }
}
