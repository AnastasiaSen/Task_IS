import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.stream.Stream;
import java.util.List;
import java.util.zip.ZipFile;
import  java.util.zip.ZipEntry;

public class Task5 {

    static void unZIP() throws IOException{
        try{
            ZipFile zFile = new ZipFile("src.zip");
            Enumeration<?> enumer = zFile.entries();

            while (enumer.hasMoreElements()){
                ZipEntry zEntry = (ZipEntry) enumer.nextElement();
                String name = "C://Users/arant/git/Task_IS/" + zEntry.getName();
                long size = zEntry.getSize();
                long compres = zEntry.getCompressedSize();
                System.out.println("Name: "+name);

                File file = new File(name);
                if(name.endsWith("/")){
                    file.mkdir();
                    continue;
                }
                File par = file.getParentFile();
                if(par!=null){
                    par.mkdir();
                }

                InputStream in = zFile.getInputStream(zEntry);
                FileOutputStream out = new FileOutputStream(file);
                byte[] bytes = new byte[1024];
                int lgth;

                while((lgth = in.read(bytes)) >= 0){
                    out.write(bytes, 0, lgth);
                }
                in.close();
                out.close();
            }
            zFile.close();
        } catch(IOException e) {e.printStackTrace();}
    }

    static void search() throws IOException{
        Files.walk(Paths.get("C://Users/arant/git/Task_IS"))
                .filter(p->{
                    try {
                        if(Files.lines(p)
                                .filter(l->{
                                    return l.contains("volatile") || l.contains("transient");
                                }).count() >0) {
                                    return true;
                        }
                    } catch (IOException e) { e.printStackTrace();}
                    return false;
                })
                            .forEach(p->{
                                System.out.println(p.toString());
                            });
    }
    /*public static  void FindKeyWord(String Folder, ArrayList<String> keyWord){
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
    }*/
}
