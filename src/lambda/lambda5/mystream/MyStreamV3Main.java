package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV3Main {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 90),
                new Student("Tomato", 50),
                new Student("Berry", 40));
        System.out.println("ex1(students) = " + ex1(students));
        System.out.println("ex2(students) = " + ex2(students));
    }

    private static List<String> ex1(List<Student> students) {
        return MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .toList();
    }
    // 점수가 80점 이상이면서 이름이 5글자인 학생 뽑기
    private static List<String> ex2(List<Student> students) {
        return MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .filter(s -> s.getName().length() == 5)
                .map(s -> s.getName().toUpperCase())
                .toList();
    }
}
