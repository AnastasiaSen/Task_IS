import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class Task9 {
    public static <T> Stream<T> zip (Stream<T> first, Stream<T> second){
        Iterator<T> a = first.iterator();
        Iterator<T> b = second.iterator();
        ArrayList<T> res = new ArrayList<T>();
        while(a.hasNext() && b.hasNext()){
            res.add(a.next());
            res.add(b.next());
        }
        return res.stream();
    }
}
