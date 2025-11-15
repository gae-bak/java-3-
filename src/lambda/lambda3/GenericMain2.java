package lambda.lambda3;

public class GenericMain2 {

    public static void main(String[] args) {
        ObjectFunction<String> objectFunction = s ->  s.toUpperCase();
        String result1 = objectFunction.apply("hello");
        System.out.println("result1 = " + result1);

        ObjectFunction<Integer> objectFunction2 = n -> n * n;
        Integer result2 = objectFunction2.apply(3);
        System.out.println("result2 = " + result2);
    }

    @FunctionalInterface
    interface ObjectFunction<T> {
        T apply(T s);
    }
}
