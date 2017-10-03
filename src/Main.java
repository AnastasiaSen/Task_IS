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

    public static void main(String[] args){
        //task1
        System.out.println(Task1.gcd(-100, -10) +"\n" +Task1.gcdfloorMod(-100, -10) +"\n" +Task1.gcdRem(-100,-10));
    }

}
