import java.util.stream.Stream;

public class Task8 {
    public static Stream<Long> generate(long a, long c, long m, long seed){
        Stream<Long> streamIter = Stream.iterate(seed, n->(n*a+c)%m);
        return streamIter;
    }
}
