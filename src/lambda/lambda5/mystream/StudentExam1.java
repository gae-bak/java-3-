package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
* 
* 80점 이상인 학생의 이름 추출하기
* */
public class StudentExam1 {
    public static void main(String[] args) {
        Student woong = new Student("박웅서", 90);
        Student seongwoo = new Student("남성우", 70);
        Student pupu = new Student("푸푸", 100);

        List<Student> students = List.of(woong, seongwoo, pupu);
        List<Student> direct = direct(students);

        for (Student student : direct) {
            System.out.println(student.getName());
        }
    }

    static List<Student> direct(List<Student> students) {
        ArrayList<Student> overEightyList = new ArrayList<>();

        for (Student student : students) {
            if(student.getScore() >= 80) {
                overEightyList.add(student);
            }
        }

        return overEightyList;
    }
}
