package opgave02.models;

import java.time.LocalDate;

public class Loan {
    private LocalDate returnDate;

    public Loan(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int calculateFine(LocalDate actualDate, boolean adult) {
        int fine = 0;
        int dageForsent = actualDate.compareTo(returnDate);

        if (dageForsent <= 0){
            return 0;
        }

        if (dageForsent <= 7){
            fine = 10;
        } else if(dageForsent <= 14){
            fine = 30;
        } else{
            fine = 45;
        }

        if (adult) return fine*2;
        else return fine;
    }

}
