package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;

/*
* 명령형 프로그래밍
* */

public class Ex1_Number {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> direct = direct(integers);
        System.out.println("direct = " + direct);
    }

    static List<Integer> direct(List<Integer> integers) {
        ArrayList<Integer> changeList = new ArrayList<>();
        for (Integer integer : integers) {
            if (integer % 2 == 0) {
                int value = integer * 2;
                changeList.add(value);
            }
        }
        return changeList;
    }
}
