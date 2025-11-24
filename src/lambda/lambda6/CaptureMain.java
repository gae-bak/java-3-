package lambda.lambda6;

public class CaptureMain {

    public static void main(String[] args) {
        final int final1 = 10; // 명시적인 final
        int final2 = 20; // 사실상 (final): 재할당 없음
        int changedVar = 30; // 값이 변경되는 변수

        Runnable annoymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 클래스 - final1: " + final1);
                System.out.println("익명 클래스 - final2: " + final2);
                // 컴파일 오류
//                System.out.println("익명 클래스 - changedVar: " + changedVar);
            }
        };

        Runnable lambda = () -> {
            System.out.println("람다 - final1: " + final1);
            System.out.println("람다 - final2: " + final2);
            // compile error
//            System.out.println("람다 - changedVar: " + changedVar);
        };

        changedVar++;
    }
}
