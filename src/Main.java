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
    private static String folder = "C:\\java";
    private static ArrayList<String> keyWord = new ArrayList() {{
        add("transparent");
        add("volatile");
    }};

        public static void main(String[] args){
        //task1
        System.out.println("Task #1");
        System.out.println(Task1.gcd(100, -10) +"\n" +Task1.gcdfloorMod(100, -10) +"\n" +Task1.gcdRem(100,-10));

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
        /*System.out.println("Task #5");
        try {Task5.unZIP();} catch (IOException e) { e.printStackTrace();}
        try {Task5.search();} catch (IOException e) {e.printStackTrace();}*/
        //Task5.FindKeyWord(folder, keyWord);

        //task6
        /*System.out.println("Task #6");
        Task6.FindChar("Words.txt");

        //task7
        System.out.println("Task #7");
        Task7.ReadFile();*/

        //task8
        System.out.println("Task #8");
        System.out.println(Task8.generate(Long.parseLong("25214903917"),11, (long)Math.pow(2,48), 1).skip(3).findFirst().get());

        //task9
        System.out.println("Task #9");
        System.out.println(Task9.zip(Stream.of("5","3","35"),Stream.of("99", "7")).skip(1).findFirst().get());


        //task10
        System.out.println("Task #10");
    }
}
