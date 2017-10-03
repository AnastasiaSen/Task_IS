import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.List;

public class Task5 {
    public static  void FindKeyWord(String Folder, ArrayList<String> keyWord){
        Path pathRoot = Paths.get(Folder);
        try (Stream<Path> fileStream = Files.walk(pathRoot).filter(Files::isRegularFile)){
            fileStream.forEach((file)-> {
                try (Stream<String> lines = Files.lines(file, Charset.forName("UTF-8"))){
                    if(lines.anyMatch(l -> checkStrForWord(l, keyWord))) System.out.println(file);
                } catch (IOException e) {e.printStackTrace();}
            });
        } catch (IOException e){ e.printStackTrace();}
    }
    private static boolean checkStrForWord(String strForCheck, List<String> wordsForCheck){
        for (String word : wordsForCheck){
            if (strForCheck.toLowerCase().contains(word.toLowerCase())) return true;
        }
        return false;
    }
}
