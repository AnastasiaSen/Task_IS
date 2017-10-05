import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task9 {
    public static void AlternateStreams()
    {
        Stream<Integer> streamFirst = Stream.of(10, 60, 80, 40, 20);
        Stream<Integer> streamSecond = Stream.of(1, 2, 7, 6, 9, 8);

        Stream<Integer> stream = zip(streamFirst, streamSecond);

        stream.forEach(elem -> System.out.print(elem + " "));
    }
    private static <T> Stream zip(Stream<T> first, Stream<T> second)
    {
        List<T> listFirst = first.collect(Collectors.toList());
        List<T> listSecond = second.collect(Collectors.toList());

        ArrayList<T> list = new ArrayList<>();

        for (int i = 0; i < listFirst.size() && i < listSecond.size(); i++)
        {
            list.add(listFirst.get(i));
            list.add(listSecond.get(i));
        }
        return list.stream();
    }

}
