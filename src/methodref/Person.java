package methodref;

public class Person {
    private String name;

    public Person() {
        this("Unknown");
    }

    public Person(String name) {
        this.name = name;
    }

    // 정적 메서드
    public static String greeting() {
        return "Hello";
    }

    // 정적 메서드, 매개변수
    public static String greetingWithName(String name) {
        return "Hello";
    }

    public String getName() {
        return name;
    }

    public String introduce() {
        return "I am " + name;
    }

    public String introduceWithNumber(int number) {
        return "I am " + name + ", my number is " + number;
    }
}
