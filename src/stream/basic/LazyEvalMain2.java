package stream.basic;

import lambda.lambda5.mystream.MyStreamV3;

import java.util.List;

public class LazyEvalMain2 {
    public static void main(String[] args) {
        List<Integer> data = List.of(1, 2, 3, 4, 5, 6);
        ex1(data);
        ex2(data);
    }

    // 파이프 라인 형식 출력
    private static void ex2(List<Integer> data) {
        System.out.println("=== 스트림 api 시작 ===");

        data.stream().filter(i -> {
                    boolean isEven = i % 2 == 0;
                    System.out.println("i = " + i + ", isEven = " + isEven);
                    return isEven;
                })
                .map(i -> {
                    int mapped = i * 10;
                    return mapped;
                });
    }

    // 일괄 출력
    private static void ex1(List<Integer> data) {
        System.out.println("== MyStreamV3 시작 ==");
        MyStreamV3.of(data)
                .filter(i -> {
                    boolean isEven = i % 2 == 0;
                    System.out.println("i = " + i + ", isEven = " + isEven);
                    return isEven;
                })
                .map(i -> {
                    int mapped = i * 10;
                    return mapped;
                });
    }
}
