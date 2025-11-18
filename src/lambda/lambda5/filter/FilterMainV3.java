package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterExam {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 짝수만 거르기
        List<Integer> evenNumbers = filterNumber(numbers, n -> n % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers);
        // 홀수만 거르기
        List<Integer> oddNumbers = filterNumber(numbers, n -> n % 2 == 1);
        System.out.println("oddNumbers = " + oddNumbers);
    }

    static List<Integer> filterNumber(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {
            boolean result = predicate.test(number);
            if (result) {
                filtered.add(number);
            }
        }
        return filtered;
    }
}
