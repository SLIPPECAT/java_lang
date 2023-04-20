package java_lang.java_standard_procedure.EX14;


import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EX14_9_Stream_reduce {
    public static void main(String[] args) {
        String[] strArr = {
                "inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr).forEach(System.out::println);  // for(i : strArr.length()){System.out.println(strArr)}

        boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length()==0);
        Optional<String> sWord = Stream.of(strArr)
                .filter(s->s.charAt(0)=='s').findFirst();

        System.out.println("noEmptyStr = " + noEmptyStr);
        System.out.println("sWord= " + sWord.get());

        // Stream<String을 IntStream으로 반환
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        OptionalInt max = intStream3.reduce(Integer::max); // Integer.MIN_VALUE, (a,b) -> a > b? a : b
        OptionalInt min = intStream4.reduce(Integer::min); // Integer.MAX_VALUE, (a,b) -> a < b? a : b

        int count = intStream1.reduce(0, (a,b) -> a + 1);
        int sum = intStream2.reduce(0, (a,b) -> a + b);
        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
        System.out.println("max.getAsInt() = " + max.getAsInt());
        System.out.println("min.getAsInt() = " + min.getAsInt());
    }
}
