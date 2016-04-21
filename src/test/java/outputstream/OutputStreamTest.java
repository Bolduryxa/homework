package outputstream;
import array.Array;
import array.IArray;
import invertmassiv.InvertMassiv;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by bolduryxa on 16.04.16.
 */
public class OutputStreamTest {

    OutputStream outputStream = new OutputStream();

    String string ="a[0] = 3\n"+"a[1] = 2\n"+"a[2] = 1\n";
    @Test
    public void testinputstream () {
        int[] expected = {1, 2, 3};
        IArray<Integer> array = new Array<>(expected.length);
        InvertMassiv invertMassiv = new InvertMassiv();
        for (int i = 0; i < expected.length; ++i) {
            array.set(i, expected[i]);
        }
        invertMassiv.invert(array);
        ByteArrayOutputStream actual = new ByteArrayOutputStream();
        PrintStream pr = new PrintStream( actual);
        outputStream.outputstreaminconsol( pr, array);
        assertArrayEquals( string.getBytes(), actual.toByteArray());
  }
}
