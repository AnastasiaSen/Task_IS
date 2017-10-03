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
        System.out.println("Task #1");
        System.out.println(Task1.gcd(-100, -10) +"\n" +Task1.gcdfloorMod(-100, -10) +"\n" +Task1.gcdRem(-100,-10));

        //task2
        System.out.println("Task #2");
        Task2.Rot13("The five boxing wizards jump quickly");

        //task3
        System.out.println("Task #3");
        System.out.println(Task3.hexToDecConvert("4EA"));

        //task4
        System.out.println("Task #4");
        Task4.ScannerToStream();

        //task5
        System.out.println("Task #5");


        //task6
        System.out.println("Task #6");


        //task7
        System.out.println("Task #7");


        //task8
        System.out.println("Task #8");


        //task9
        System.out.println("Task #9");


        //task10
        System.out.println("Task #10");
    }
}
