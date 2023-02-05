package test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testFindResultingNumber_1() {
        int[] input = {0, 4, 6, 6, 6, 8, 8, 7};
        int expected = 8;
        int actual = Main.findResultingNumber(input);
        assertEquals(expected, actual);
    }
    @Test
    public void testFindResultingNumber_2() {
        int[] input = {3, 7, 5};
        int expected = 3;
        int actual = Main.findResultingNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindResultingNumber_3() {
        int[] input = {9, 9, 9, 9};
        int expected = 4;
        int actual = Main.findResultingNumber(input);
        assertEquals(expected, actual);
    }
}