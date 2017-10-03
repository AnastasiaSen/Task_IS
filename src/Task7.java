import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task7 {
    public static void ReadFile(){
        final int lineLgth = 5;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name to read from");
        String fileName = scan.next();
        System.out.println("Enter number of line to random-show");
        int lineShowCount = scan.nextInt();
        scan.close();

        Path pathFile = Paths.get(fileName);
        File file = pathFile.toFile();
        List<String> fileList = new ArrayList<>((int)(file.length()/lineLgth));
        long lineCount;

        try(Stream<String> lines = Files.lines(pathFile)){
            lines.forEach(line -> fileList.add(line));
        } catch (IOException e) {e.printStackTrace();}
        lineCount = fileList.size();

        Random rand = new Random();
        for (int i = 0; i < lineShowCount;i++){
            System.out.println((i+1) +". " + fileList.get(rand.nextInt(Math.toIntExact(lineCount) - 1)));
        }
    }
}
