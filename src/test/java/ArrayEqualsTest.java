import array.Array;
import array.IArray;
import array.arrayecxeption.ArrayException;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by bolduryxa on 16.04.16.
 */
public class ArrayEqualsTest {
    private ArrayTest arraytest;


    @Before
    public void setUp () {
        arraytest = new ArrayTest();

    }
    @Test
    public void testarrayequals () {
        int[] expected = {1, 2, 3};
        IArray<Integer> array = new Array<>(expected.length);
        for (int i = 0; i < expected.length; ++i)
            array.set(i, expected[i]);
        for (int i = 0;i<array.size();++i)
        assertEquals(arraytest.get(i),(int)array.get(i));

    }
    @Test(expected = ArrayException.class)
    public void testExceptionIndexOutOfBoundsExceptionInSize () {
        Array array = new Array(-1);
    }
    @Test(expected =ArrayException.class)
    public void testExceptionIndexOutOfBoundsExceptionInGet () {
        Array array = new Array(3);
        array.get(-100);

    }
    @Test(expected = ArrayException.class)
    public void testExceptionIndexOutOfBoundsExceptionInSet () {
        Array array = new Array(3);
        array.set(-100,10);

    }
}
