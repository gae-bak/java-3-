package lambda.lambda6;

public class OuterMain {
    private String message = "외부 클래스";

    public void execute() {

        Runnable annoymous = new Runnable() {
            private String message = "익명 클래스";

            @Override
            public void run() {
                System.out.println("[익명 클래스] this : " + this);
                System.out.println("[익명 클래스] this.getClass : " + this.getClass());
                System.out.println("[익명 클래스] this.message : " + this.message);
            }
        };

        // 람다 예시
        Runnable lambda = () -> {
            // 람다에서의 this는 람다가 선언된 클래스의 인스턴스(즉, 외부 클래스를) 가리킴
            System.out.println("[람다] this: " + this);
            System.out.println("[람다] this.class: " + this.getClass());
            System.out.println("[람다] this.message: " + this.message);
        };

        annoymous.run();
        lambda.run();
    }

    public static void main(String[] args) {
        OuterMain outer = new OuterMain();
        System.out.println("[외부 클래스]: " + outer);
        outer.execute();
    }
}
