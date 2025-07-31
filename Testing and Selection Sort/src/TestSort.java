import org.junit.Test;
import static org.junit.Assert.*;

public class TestSort {

    @Test
    /** Test the sort method of the Sort class. */
    public void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals(expected[i])) {
                System.out.println("Mismatch in position" + i + ", expected: " + expected + ", but got: " + input[i] + ".");
                break;
            }
        }
    }

    @Test
    public void testSort1() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        assertArrayEquals(expected, input);

    }

    @Test
    public void testFIndSmallest() {
        String[] input = {"an", "have", "i", "egg"};
        int expected = 3;
        int actual = Sort.findSmallest(input, 1);
        assertEquals(expected, actual);

    }

    @Test
    public void testSwap() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"egg", "have", "an", "i"};
        Sort.swap(input, 0, 3);
        assertArrayEquals(input, expected);

    }

    @Test
    public void testSum() {
        int[] input = {1, 2, 3, 4, 5};
        int expected = 15;
        int actual = Sort.add(input);
        assertEquals(expected, actual);
    }

}
