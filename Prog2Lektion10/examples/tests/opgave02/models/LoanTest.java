package opgave02.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class LoanTest {

    @Test
    void calculateFine() {
        Loan loan = new Loan(LocalDate.of(2025, 1, 1));

        //BARN
        assertEquals(10, loan.calculateFine(LocalDate.of(2025, 1, 3), false));
        assertEquals(30, loan.calculateFine(LocalDate.of(2025, 1, 12), false));
        assertEquals(45, loan.calculateFine(LocalDate.of(2025, 1, 17), false));

        //VOKSEN
        assertEquals(20, loan.calculateFine(LocalDate.of(2025, 1, 8), true));
        assertEquals(60, loan.calculateFine(LocalDate.of(2025, 1, 15), true));
        assertEquals(90, loan.calculateFine(LocalDate.of(2025, 1, 16), true));
    }
}