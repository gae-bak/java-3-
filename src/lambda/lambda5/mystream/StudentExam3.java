package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
* 
* 80점 이상인 학생의 이름 추출하기
* */
public class StudentExam3 {
    public static void main(String[] args) {
        Student woong = new Student("박웅서", 90);
        Student seongwoo = new Student("남성우", 70);
        Student pupu = new Student("푸푸", 100);

        List<Student> students = List.of(woong, seongwoo, pupu);
        List<String> lambda = lambda(students);

        System.out.println("lambda = " + lambda);
    }

    static List<String> lambda(List<Student> students) {
        List<Student> filterStudents = GenericFilter.filter(students, s -> s.getScore() >= 80);
        List<String> mapOverEighty = GenericMapper.map(filterStudents, s -> s.getName());

        return mapOverEighty;
    }
}
