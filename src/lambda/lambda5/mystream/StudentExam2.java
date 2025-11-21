package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
* 
* 80점 이상인 학생의 이름 추출하기
* */
public class StudentExam2 {
    public static void main(String[] args) {
        Student woong = new Student("박웅서", 90);
        Student seongwoo = new Student("남성우", 70);
        Student pupu = new Student("푸푸", 100);

        List<Student> students = List.of(woong, seongwoo, pupu);
        List<Student> lambda = lambda(students, s -> s.getScore() >= 80);

        for (Student student : lambda) {
            System.out.println(student.getName());
        }
    }

    static List<Student> lambda(List<Student> students, Predicate<Student> predicate) {
        ArrayList<Student> overEightyList = new ArrayList<>();

        for (Student student : students) {
            if(predicate.test(student)) {
                overEightyList.add(student);
            }
        }

        return overEightyList;
    }
}
