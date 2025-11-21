package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 짝수만 거르기
        List<Integer> evenNumbers = GenericFilter.filter(numbers, n -> n % 2 == 0);

        List<String> strings = List.of("A", "BB", "CCC");
        List<String> stringsResult = GenericFilter.filter(strings, s -> s.length() >= 2);
        System.out.println("stringsResult = " + stringsResult);
    }

    static List<Integer> filterNumber(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                filtered.add(number);
            }
        }
        return filtered;
    }
}
