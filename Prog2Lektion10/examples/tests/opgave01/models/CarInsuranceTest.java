package opgave01.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInsuranceTest {

    @Test
    void calculatePremium() {
        CarInsurance carInsurance = new CarInsurance(1000);

        //Age under 25
        assertEquals(1250, carInsurance.calculatePremium(24, false, 2));
        //Is a woman
        assertEquals(950, carInsurance.calculatePremium(25, true, 2));
        assertEquals(1200, carInsurance.calculatePremium(24, true, 2));
        assertEquals(1050, carInsurance.calculatePremium(24, true, 5));
        //3 years without damage
        assertEquals(850, carInsurance.calculatePremium(25, false, 3));
        //throws exception
        assertThrows(RuntimeException.class, () -> carInsurance.calculatePremium(17, false, 2));
        assertThrows(RuntimeException.class, () -> carInsurance.calculatePremium(18, false, 2));
        assertThrows(RuntimeException.class, () -> carInsurance.calculatePremium(18, false, -1));

        assertThrows(IllegalArgumentException.class, () -> new CarInsurance(-10));
    }
}