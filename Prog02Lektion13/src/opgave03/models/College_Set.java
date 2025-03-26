package opgave03.models;

import java.util.LinkedHashSet;
import java.util.Set;

public class College_Set {
    private String navn;
    private Set<Student> studentArrayList = new LinkedHashSet<>();

    public College_Set(String navn) {
        this.navn = navn;
    }

    public String getName(){
        return navn;
    }

    public void addStudent(Student student){

        if (!studentArrayList.contains(student)){
            studentArrayList.add(student);
        }
    }

    public void removeStudent(Student student){
        if (studentArrayList.contains(student)){
            studentArrayList.remove(student);
        }
    }

    public double calcAverage(){
        if (studentArrayList.isEmpty()){
            return -1;
        }

        double average = 0;
        for (Student student : studentArrayList) {
            for (Integer grade : student.getGrades()) {
                average += grade;
            }
        }
        return average / studentArrayList.size();
    }

    public Student findStudent(int studentNr){
        for (Student student : studentArrayList) {
            if (student.getStudentNr() == studentNr){
                return student;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return navn;
    }
}
