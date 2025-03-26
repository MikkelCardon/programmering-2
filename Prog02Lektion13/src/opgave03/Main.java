package opgave03;

import opgave03.models.College_HashMap;
import opgave03.models.College_Set;
import opgave03.models.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        College_HashMap college = new College_HashMap("Eaa");
        college.addStudent(new Student(1, "Mikkel", List.of(7, 10, 4, 2, 10)));
        college.addStudent(new Student(2, "Flemming", List.of(2, 10, 4, 2, 10)));
        college.addStudent(new Student(3, "Søren", List.of(2, 10, 4, 2, 10)));
        college.addStudent(new Student(4, "Bente", List.of(2, 10, 4, 2, 10)));

        System.out.println(college.calcAverage());
        ArrayList<Student> arrayList = new ArrayList<>();
        college.getStudentHashMap().forEach((integer, student) -> arrayList.add(student));

        System.out.println(arrayList);
        arrayList.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));

        System.out.println(arrayList);
    }
}
