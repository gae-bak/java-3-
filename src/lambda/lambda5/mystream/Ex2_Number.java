package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
* 선언적 프로그래밍
* */

public class Ex2_Number {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> change = lambda(integers);
        System.out.println("change = " + change);
    }

    // 들여쓰기 2번만 해보기
    static List<Integer> lambda(List<Integer> integers) {
        List<Integer> filteredList = GenericFilter.filter(integers, i -> i % 2 == 0);
        List<Integer> mapList = GenericMapper.map(filteredList, i -> i * 2);
        return mapList;
    }
}
