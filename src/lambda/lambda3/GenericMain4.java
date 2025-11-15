package lambda.lambda3;

public class GenericMain4 {

    public static void main(String[] args) {
        GenericFunction<String, String> toUpperCase = s ->  s.toUpperCase();
        GenericFunction<String, Integer> stringLength = n -> n.length();
        GenericFunction<Integer, Integer> square = x -> x * x;
        GenericFunction<Integer, Boolean> isEven = n -> n % 2 == 0;

        System.out.println("toUpperCase.apply(\"hello\") = " + toUpperCase.apply("hello"));
        System.out.println("stringLength.apply(\"hello\") = " + stringLength.apply("hello"));
        System.out.println("square.apply(5) = " + square.apply(5));
        System.out.println("isEven.apply(3) = " + isEven.apply(3));
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }
}
