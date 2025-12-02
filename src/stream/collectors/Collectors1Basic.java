package stream.collectors;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Collectors1Basic {
    public static void main(String[] args) {
        List<String> list = Stream.of("Java", "Spring", "JPA")
                .collect(toList());
        System.out.println("list = " + list);

        // 수정 불가능 리스트
        List<Integer> unmodifiableList = Stream.of(1, 2, 3)
                .collect(toUnmodifiableList());
        // 예외 발생
//        unmodifiableList.add(1);
        System.out.println("unmodifiableList = " + unmodifiableList);

        Set<Integer> set = Stream.of(1, 2, 2, 3, 3, 3)
                .collect(toSet());
        System.out.println("set = " + set);

        TreeSet<Integer> treeSet = Stream.of(3, 4, 5, 2, 1)
                .collect(toCollection(() -> new TreeSet<>()));
        System.out.println("treeSet = " + treeSet);

    }
}
