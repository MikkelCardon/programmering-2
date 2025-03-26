package opgave03.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student>, Comparator<String> {

    private int studentNr;
    private String name;
    List<Integer> grades = new ArrayList<>();

    public Student(int studentNr, String name, List<Integer> grades) {
        this.studentNr = studentNr;
        this.name = name;
        this.grades = grades;
    }

    public int getStudentNr() {
        return studentNr;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public int compareTo(Student o) {
        return studentNr - o.getStudentNr();
    }



    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString(){
        return name;
    }
}
