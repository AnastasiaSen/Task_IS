import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.abs;

public class Main {

    //task #1
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
        return gcdfloorMod(b, rem(a,b));
    }
    private static int rem(int a, int b){
        a = abs(a);
        b = abs(b);
        while (a > b){
            a -= b;
        }
        return a;
    }
}
