import static java.lang.Math.abs;

public class Task1 {

    public static int gcd(int a, int b)
    {
        if (b == 0) return a;
        return gcd(abs(b), a % b);
    }

    public static int gcdfloorMod(int a, int b) {
        if (b == 0) return a;
        return gcdfloorMod(abs(b), Math.floorMod(a,b));
    }
    public static int gcdRem(int a, int b) {
        if (b == 0) return a;
        return gcdfloorMod(b, a>b?a-b:b-a);
    }
}
