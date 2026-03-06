package junit.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringOperationsTest {

    @Test
    public void testLength() {
        assertEquals(5, StringOperations.getLength("Hello"));
    }

    @Test
    public void testReverse() {
        assertEquals("olleH", StringOperations.reverse("Hello"));
    }

    @Test
    public void testUppercase() {
        assertEquals("HELLO", StringOperations.toUpper("hello"));
    }
}