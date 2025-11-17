package lambda.lambda4;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OperatorMain {
    public static void main(String[] args) {
        // UnaryOperator
        Function<Integer, Integer> square1 = x -> x * x;
        UnaryOperator<Integer> square2 = x -> x * x;

        // Binary Operator
        BiFunction<Integer, Integer, Integer> addition1 = (a, b) -> a + b;
        BinaryOperator<Integer> addition2 = (a, b) -> a + b;
    }
}
