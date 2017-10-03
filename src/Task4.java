import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task4 {
    public static void ScannerToStream()
    {
        //integers
        toIntStream("Int.txt");
        //double
        toDoubleStream("Double.txt");
        //words
        toWordsStream("Words.txt");
        //lines
        toLinesStream("Lines.txt");
    }
    private static void toIntStream(String nameFile){
        try(FileInputStream stream = new FileInputStream(nameFile)){
            Scanner scan = new Scanner(stream);
            ArrayList<Integer> IntList = new ArrayList<>();

            System.out.println("Read Integers from file: " + nameFile);
            while (scan.hasNext()){
                if(scan.hasNextInt()) IntList.add(scan.nextInt());
                else scan.next();
            }
            Stream<Integer> integers = IntList.stream();
            System.out.println("Integers stream: " + Arrays.toString(integers.toArray(Integer[]::new)));
            integers.close();
            scan.close();
        } catch(FileNotFoundException e) { e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();}
    }

    private static void toDoubleStream(String nameFile){
        try(FileInputStream stream = new FileInputStream(nameFile)){
            Scanner scan = new Scanner(stream);
            ArrayList<Double> doubleList = new ArrayList<>();

            System.out.println("Read Double from file: " + nameFile);
            while (scan.hasNext()){
                if(scan.hasNextDouble()) doubleList.add(scan.nextDouble());
                else scan.next();
            }
            Stream<Double> doub = doubleList.stream();
            System.out.println("Double stream: " + Arrays.toString(doub.toArray(Double[]::new)));
            doub.close();
            scan.close();
        } catch(FileNotFoundException e) { e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();}
    }

    private static void toWordsStream(String nameFile){
        try(FileInputStream stream = new FileInputStream(nameFile)){
            Scanner scan = new Scanner(stream);
            ArrayList<String> wordsList = new ArrayList<>();

            System.out.println("Read Words from file: " + nameFile);
            while (scan.hasNext()){
                wordsList.add(scan.next());
            }
            Stream<String> wordsStream = wordsList.stream();
            System.out.println("Words stream: " + Arrays.toString(wordsStream.toArray(String[]::new)));
            wordsStream.close();
            scan.close();
        } catch(FileNotFoundException e) { e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();}
    }

    private static void toLinesStream(String nameFile){
        try(FileInputStream stream = new FileInputStream(nameFile)){
            Scanner scan = new Scanner(stream);
            ArrayList<String> linesList = new ArrayList<>();

            System.out.println("Read Lines from file: " + nameFile);
            while (scan.hasNext()){
                linesList.add(scan.nextLine());
            }
            Stream<String> linesStream = linesList.stream();
            System.out.println("Lines stream: " + Arrays.toString(linesStream.toArray(String[]::new)));
            linesStream.close();
            scan.close();
        } catch(FileNotFoundException e) { e.printStackTrace();}
        catch (IOException e) {e.printStackTrace();}
    }
}
