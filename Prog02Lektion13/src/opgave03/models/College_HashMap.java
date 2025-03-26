package opgave03.models;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class College_HashMap {
    private String navn;
    private HashMap<Integer, Student> studentHashMap = new HashMap<>();

    public College_HashMap(String navn) {
        this.navn = navn;
    }

    public String getName(){
        return navn;
    }

    public void addStudent(Student student){
        if (!studentHashMap.containsValue(student)){
            studentHashMap.put(student.getStudentNr(), student);
        }
    }

    public void removeStudent(Student student){
        if (studentHashMap.containsKey(student)){
            studentHashMap.remove(student);
        }
    }

    public double calcAverage(){
        if (studentHashMap.isEmpty()){
            return -1;
        }
        double gradesSum = 0;
        int gradesCount = 0;

        for (Student student : studentHashMap.values()) {
            for (Integer grade : student.getGrades()) {
                gradesSum += grade;
                gradesCount++;
            }
        }

        return gradesSum / gradesCount;
    }

    public Student findStudent(int studentNr){
        if (studentHashMap.containsKey(studentNr)){
            return studentHashMap.get(studentNr);
        }
        return null;
    }

    @Override
    public String toString(){
        return navn;
    }

    public HashMap<Integer, Student> getStudentHashMap() {
        return studentHashMap;
    }
}
