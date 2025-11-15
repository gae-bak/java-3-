package lambda.lambda3;

public class GenericMain3 {

    public static void main(String[] args) {
        GenericFunction<String, String> objectFunction = s ->  s.toUpperCase();
        String result1 = objectFunction.apply("hello");
        System.out.println("result1 = " + result1);

        GenericFunction<Integer, Integer> objectFunction2 = n -> n * n;
        Integer result2 = objectFunction2.apply(3);
        System.out.println("result2 = " + result2);
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }
}
