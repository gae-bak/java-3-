package functional;

import java.util.function.Function;

public class FirstClassCitizenMain1 {
    public static void main(String[] args) {
        Function<Integer, Integer> func = i -> i * 2;

        applyFunction(10, func);

        getFunc().apply(10);
    }

    private static Function<Integer, Integer> getFunc() {
        return x -> x * 2;
    }

    private static Integer applyFunction(int i, Function<Integer, Integer> func) {
        return func.apply(i);
    }
}
