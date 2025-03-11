package opgave04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingSerieTest {
    private BowlingSerie bowling;

    @BeforeEach
    void setUp(){
       bowling = new BowlingSerie();
    }

    @Test
    void strikePoints() {
       int[][] points = bowling.getPoint();
       points[0] = new int[]{10, 0};
       points[1] = new int[]{2, 3};
       bowling.calculatePoints();

       assertEquals(15, bowling.getScore()[0]);
    }
}