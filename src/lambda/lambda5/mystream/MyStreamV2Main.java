package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV2Main {

    public static void main(String[] args) {
        // 짝수만 남기고, 그 값들을 2배로 만들기
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = MyStreamV2.of(integers)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();

        System.out.println("result = " + result);
    }

}
