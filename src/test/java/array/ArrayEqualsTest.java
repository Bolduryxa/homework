package array;
import array.arrayecxeption.ArrayException;
import junit.framework.TestCase;
import org.junit.Test;
import static junit.framework.TestCase.fail;

/**
 * Created by bolduryxa on 16.04.16.
 */
public class ArrayEqualsTest {

    @Test
    public void testarrayequals () {
        int[] expected = {1, 2, 3};
        IArray<Integer> array = new Array<>(expected.length);
        for (int i = 0; i < expected.length; ++i) {
            array.set(i, expected[i]);
        }
        for (int i = 0;i<array.size();++i) {
            TestCase.assertEquals(expected[i], (int) array.get(i));
        }
    }
    @Test
    public void testarrayequalstypechar () {
        char[] expected = {'1', '2', '3'};
        IArray<Character> array = new Array<>(expected.length);
        for (int i = 0; i < expected.length; ++i) {
            array.set(i, expected[i]);
        }
        for (int i = 0;i<array.size();++i) {
            TestCase.assertEquals(expected[i],(char) array.get(i));
        }
    }
    @Test
    public void testarrayequalstypedouble () {
        double[] expected = {1.0, 2.0, 3.0};
        IArray<Double> array = new Array<>(expected.length);
        for (int i = 0; i < expected.length; ++i) {
            array.set(i, expected[i]);
        }
        for (int i = 0;i<array.size();++i) {
            TestCase.assertEquals(expected[i], array.get(i));
        }
    }

    @Test(expected = ArrayException.class)
    public void testExceptionIndexOutOfBoundsExceptionInSize () {
        Array array = new Array(-1);
        fail();
    }

    @Test(expected =ArrayException.class)
    public void testExceptionIndexOutOfBoundsExceptionInGet () {
        Array array = new Array(3);
        array.get(-100);
        fail();
    }

    @Test(expected = ArrayException.class)
    public void testExceptionIndexOutOfBoundsExceptionInSet () {
        Array array = new Array(3);
        array.set(-100,10);
        fail();
    }
}
