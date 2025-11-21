package lambda.lambda5.mystream;

import javax.print.attribute.standard.NumberUpSupported;
import java.util.List;

public class MyStreamV1Main {

    public static void main(String[] args) {
        // 짝수만 남기고, 그 값들을 2배로 만들기
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        MyStreamV1 myStreamV1 = new MyStreamV1(integers);

        // 내가 한 것
        List<Integer> list = myStreamV1.filter(i -> i % 2 == 0).map(i -> i * 2).toList();

        System.out.println("list = " + list);

        returnValue(integers);
        List<Integer> resultList = methodChain(integers);
        System.out.println("resultList = " + resultList);
    }

    private static List<Integer> methodChain(List<Integer> integers) {
        MyStreamV1 myStreamV1 = new MyStreamV1(integers);
        List<Integer> resultList = myStreamV1.filter(i -> i % 2 == 0).map(i -> i * 2).toList();

        return resultList;
    }

    private static void returnValue(List<Integer> integers) {
        MyStreamV1 stream = new MyStreamV1(integers);
        MyStreamV1 filterStream = stream.filter(i -> i % 2 == 0);
        System.out.println("filterStream.toList() = " + filterStream.toList());

        MyStreamV1 mappedStream = filterStream.map(i -> i * 2);
        System.out.println("mappedStream = " + mappedStream.toList());
    }
}
