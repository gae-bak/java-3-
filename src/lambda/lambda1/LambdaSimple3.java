package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple3 {

    public static void main(String[] args) {
        // 타입 생략전
        MyFunction myFunction = (int a, int b) -> a + b;

        // Myfunction 타입을 통해 타입 추론 가능, 람다는 타입 생략 가능
        MyFunction myFunction2 = (a, b) -> a + b;
        System.out.println("function2 :" + myFunction2.apply(1,2));
    }
}
