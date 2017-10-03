import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task6 {
    public static void FindChar(String fileToFind){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter char fo search");
        char charToSearch = scan.next().charAt(0);
        Path pathToFile = Paths.get(".//"+ fileToFind);
        ArrayList<Integer> charCount = new ArrayList();
        try(Stream<String> lines = Files.lines(pathToFile)){
            lines.forEach((line) -> charCount.add((int) line.chars().filter(ch -> ch == charToSearch).count()));
        } catch(IOException e) { e.printStackTrace();}
        int sum = 0;
        for(Integer element : charCount) {
            sum +=element;
        }
        System.out.println(sum);
    }
}
