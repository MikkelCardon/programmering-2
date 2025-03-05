package opgave04.model;

public class Absence {
    private static int[][] absenceSchema = {
            {2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0},
            {1, 2, 1, 2, 1, 2, 0, 2, 0, 0, 4, 0},
            {5, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0}
    };

    public static void print(){
        System.out.println("Måned: 1 2 3 4 5 6 7 8 9 10 11 12");
        System.out.println("___________________________");

        for (int outer = 0; outer < absenceSchema.length; outer++) {
            System.out.print(outer + " | ");
            for (int inner = 0; inner < 12; inner++) {
                System.out.print(absenceSchema[outer][inner] + " ");
            }
            System.out.println();
        }
    }

    public static int totalAbsence(int studentNumber){
        int total = 0;

        for (int i : absenceSchema[studentNumber]) {
            total += i;
        }

        return total;
    }

    public static double average(int studentNumber){
        return totalAbsence(studentNumber)*1.0 / absenceSchema[studentNumber].length;
    }

    public static int studentsWithoutAbsence(){
        int count = 0;

        for (int i = 0; i < absenceSchema.length; i++) {
            if (totalAbsence(i) == 0){
                count++;
            }
        }
        return count;
    }

    public static int mostAbsence(){
        int student_id = 0;
        int daysOfAbsence = totalAbsence(0);

        for (int i = 0; i < absenceSchema.length; i++) {
            if (totalAbsence(i) > daysOfAbsence){
                student_id = i;
                daysOfAbsence = totalAbsence(i);
            }
        }
        return student_id;
    }

    public static void reset(int studentNumber){
        absenceSchema[studentNumber] = new int[12];
    }
}
