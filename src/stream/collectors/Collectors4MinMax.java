package stream.collectors;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collectors4MinMax {
    public static void main(String[] args) {
        Integer max = Stream.of(1, 2, 3)
                .collect(Collectors.maxBy((i1, i2) -> i1.compareTo(i2))).get();

        System.out.println("max = " + max);

        Integer max2 = Stream.of(1, 2, 3)
                .max((i1, i2) -> i1.compareTo(i2)).get();

        Integer max3 = Stream.of(1, 2, 3)
                .max(Integer::compareTo).get();
        // 기본형 특화 스트림
        int max4 = IntStream.of(1, 2, 3).max().getAsInt();


        Integer min = Stream.of(1, 2, 3)
                .collect(Collectors.minBy((i1, i2) -> i1.compareTo(i2))).get();
        System.out.println("min = " + min);
    }
}
