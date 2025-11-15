package lambda.ex1;

public class M1After {

    public static void greetAll(MessagePass pass) {
        System.out.println("=== 시작 ===");
        System.out.println(pass);
        System.out.println("=== 끝 ===");
    }

    public static void main(String[] args) {
        greetAll(() -> System.out.println("good Morning"));
        greetAll(() -> System.out.println("good Afternoon"));
        greetAll(() -> System.out.println("good Evening"));
    }
}