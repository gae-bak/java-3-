package lambda.ex1;

public class M2After {

    public static void print1() {
        System.out.println("무게: 10kg");
    }

    public static void print2() {
        System.out.println("무게: 50kg");
    }

    public static void print3() {
        System.out.println("무게: 200g");
    }

    public static void print4() {
        System.out.println("무게: 40g");
    }

    public static void main(String[] args) {
        MessagePass2 messagePass = (s) -> System.out.println("무게: " + s);
        messagePass.pass("10kg");
        messagePass.pass("50kg");
        messagePass.pass("200g");
        messagePass.pass("40g");
    }
}