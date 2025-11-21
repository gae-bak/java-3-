package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapExam2 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");
        //문자열을 숫자로 변환
        System.out.println("numbers = " + map(list, s1 -> Integer.valueOf(s1)));

        // 문자열의 길이
        System.out.println("lengths = " + map(list, s -> s.length()));

    }

    private static List<Integer> map(List<String> list, Function<String, Integer> function) {
        List<Integer> numbers = new ArrayList<>();
        for (String string : list) {
            numbers.add(function.apply(string));
        }
        return numbers;
    }
}
