package stream.basic;

import java.util.List;
import java.util.stream.Stream;

public class DuplicateExecutionMain {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        stream.forEach(System.out::println); // 최초 실행

        // 오류 메세지 IllegalStateException: 이미 스트림이 작동 되었거나 닫혔습니다.
        stream.forEach(System.out::println); // 스트림 중복 실행

        List<Integer> list = List.of(1, 2, 3);
        Stream.of(list).forEach(System.out::println);
        Stream.of(list).forEach(System.out::println);
    }
}
