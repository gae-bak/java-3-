package lambda.lambda3;

public class ObjectMain {
    public static void main(String[] args) {
        ObjectFunction objectFunction = new ObjectFunction() {
            @Override
            public Object apply(Object o) {
                return ((String) o).toUpperCase();
            }
        };

        String result = (String) objectFunction.apply("3");
    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object o);
    }
}
