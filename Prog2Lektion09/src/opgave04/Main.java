package opgave04;

import opgave04.model.Absence;

public class Main {
    public static void main(String[] args) {
        Absence.print();

        System.out.println(Absence.totalAbsence(0));
        System.out.println(Absence.average(0));
        System.out.println(Absence.studentsWithoutAbsence());

        Absence.reset(0);
        System.out.println(Absence.studentsWithoutAbsence());

    }
}
