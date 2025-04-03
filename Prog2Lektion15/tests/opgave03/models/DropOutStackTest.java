package opgave03.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

class DropOutStackTest {
    private DropOutStack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new DropOutStack<>(3); // Stack with a max size of 3
    }

    @Test
    void testPushAndPeek() {
        stack.push(10);
        assertEquals(10, stack.peek());
        stack.push(20);
        assertEquals(20, stack.peek());
    }

    @Test
    void testPop() {
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
        assertThrows(NoSuchElementException.class, stack::pop);
    }

    @Test
    void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(10);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void testClear() {
        stack.push(10);
        stack.push(20);
        stack.clear();
        assertTrue(stack.isEmpty());
        assertThrows(NoSuchElementException.class, stack::peek);
    }

    @Test
    void testSize() {
        assertEquals(0, stack.size());
        stack.push(10);
        assertEquals(1, stack.size());
        stack.push(20);
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
    }

    @Test
    void testDropOutBehavior() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); // This should drop 10
        assertEquals(3, stack.size());
        assertEquals(40, stack.peek());
        assertEquals(40, stack.pop());
        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertThrows(NoSuchElementException.class, stack::pop);
    }
}
