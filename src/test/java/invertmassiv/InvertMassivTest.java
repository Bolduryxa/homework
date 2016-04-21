package invertmassiv;
import array.Array;
import array.IArray;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by bolduryxa on 11.04.16.
 */
public class InvertMassivTest {

    @Test
    public void testInvert ( ) {
        int[] expected = {1, 2, 3};
        IArray<Integer> actual = new Array<>(expected.length);
        InvertMassiv invertMassiv = new InvertMassiv();
        for (int i = 0; i < expected.length; ++i) {
            actual.set(i, expected[i]);
        }
        invertMassiv.invert(actual);
        for (int i = 0; i < actual.size(); ++i) {
            assertEquals(expected[expected.length - i - 1], (int) actual.get(i));
        }
    }
    @Test
    public void testInvertDouble ( ) {
        double[] expected = {1.0, 2.0, 3.0};
        IArray<Double> actual = new Array<>(expected.length);
        InvertMassiv invertMassiv = new InvertMassiv();
        for (int i = 0; i < expected.length; ++i) {
            actual.set(i, expected[i]);
        }
        invertMassiv.invert(actual);
        for (int i = 0; i < actual.size(); ++i) {
            assertEquals(expected[expected.length - i - 1],  actual.get(i));
        }
    }
    @Test
    public void testInvertChar ( ) {
        char[] expected = {'1','2','3'};
        IArray<Character> actual = new Array<>(expected.length);
        InvertMassiv invertMassiv = new InvertMassiv();
        for (int i = 0; i < expected.length; ++i) {
            actual.set(i, expected[i]);
        }
        invertMassiv.invert(actual);
        for (int i = 0; i < actual.size(); ++i) {
            assertEquals(expected[expected.length - i - 1], (char) actual.get(i));
        }
    }
}
