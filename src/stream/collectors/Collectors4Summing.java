package stream.collectors;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collectors4Summing {
    public static void main(String[] args) {
        // 다운 스트림 컬렉터에서 유용하게 사용
        Long count1 = Stream.of(1, 2, 3).collect(Collectors.counting());
        System.out.println("count1 = " + count1);

        long count2 = Stream.of(1, 2, 3).count();
        System.out.println("count2 = " + count2);

        Double average1 = Stream.of(1, 2, 3).collect(Collectors.averagingInt(i -> i));
        System.out.println("average1 = " + average1);

        double average2 = Stream.of(1, 2, 3).mapToInt(i -> i).average().getAsDouble();
        System.out.println("average2 = " + average2);

        // 기본형 특화 스트림
        double average3 = IntStream.of(1, 2, 3).average().getAsDouble();

        // 통계
        IntSummaryStatistics stat = Stream.of("Apple", "Banana", "Tomato").collect(Collectors.summarizingInt(s -> s.length()));
        System.out.println("stat = " + stat.getSum());
        System.out.println("stat.getAverage() = " + stat.getAverage());
        

    }
}
