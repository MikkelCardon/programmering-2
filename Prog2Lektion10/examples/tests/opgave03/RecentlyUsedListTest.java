package opgave03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecentlyUsedListTest {
    private ListTest listTest;

    @BeforeEach
    void setUp() {
        listTest = new ListTest();
    }

    @Test
    void addTwoElements() {
        listTest.add("Text1");
        listTest.add("Text2");
        String[] expected = {"Text2", "Text1"};

        assertArrayEquals(expected, listTest.getRecentlyUsed());
    }

    @Test
    void addFourElements(){
        listTest.add("Text1");
        listTest.add("Text2");
        listTest.add("Text3");
        listTest.add("Text4");
        String[] expected2 = {"Text4", "Text3", "Text2", "Text1"};
        assertArrayEquals(expected2, listTest.getRecentlyUsed());
    }

    @Test
    void addStringAlreadyInArray(){
        listTest.add("Text1");
        listTest.add("Text2");
        listTest.add("Text3");
        listTest.add("Text4");

        listTest.add("Text1");
        String[] expected3 = {"Text1", "Text4", "Text3", "Text2"};
        assertArrayEquals(expected3, listTest.getRecentlyUsed());
    }

    @Test
    void addSixElements(){
        listTest.add("Text1");
        listTest.add("Text2");
        listTest.add("Text3");
        listTest.add("Text4");
        listTest.add("Text5");
        listTest.add("Text6");
        String[] expected4 = {"Text6", "Text5","Text4", "Text3", "Text2"};
        assertArrayEquals(expected4, listTest.getRecentlyUsed());
    }


/* REMOVE TESTS */
    @Test
    void removeFromEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> listTest.remove(0));
    }

    @Test
    void removeOutOfBounce() {
        listTest.add("Thing1");
        listTest.add("Thing2");
        listTest.add("Thing3");

        assertThrows(IllegalArgumentException.class, () -> listTest.remove(-1));
        assertThrows(IllegalArgumentException.class, () -> listTest.remove(3));
        assertThrows(IllegalArgumentException.class, () -> listTest.remove(6));
    }

    @Test
    void removeFromArray() {
        listTest.add("toRemove");
        listTest.add("Other Thing");
        String[] expected = {"Other Thing"};

        assertEquals("toRemove", listTest.remove(1));
        assertArrayEquals(expected, listTest.getRecentlyUsed());
    }

/* TEST AF getRecentlyUsed()*/
    @Test
    void returnOfEmptyArray() {
        String[] emptyList = new String[0];
        assertArrayEquals(emptyList, listTest.getRecentlyUsed());
    }
}