package inputstream;
import array.IArray;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

/**
 * Created by bolduryxa on 16.04.16.
 */
public class InputStreamTest {


    @Test(expected = ConsolStreamException.class)
    public void testExceptionConsolStreamExceptionSize ( ) {
        ByteArrayInputStream bais = new ByteArrayInputStream( "A \n   1\n   2\n     3".getBytes());
        ConsolStream<Integer> cs = new ConsolStream<>( Integer::valueOf);
        IArray<Integer> array = cs.inputconsolearray( bais, System.out);
        fail();
    }

    @Test(expected = ConsolStreamException.class)
    public void testExceptionConsolStreamExceptionValue ( ) {
        ByteArrayInputStream bais = new ByteArrayInputStream( "3 \n   A\n   2\n     3".getBytes());
        ConsolStream<Integer> cs = new ConsolStream<>( Integer::valueOf);
        IArray<Integer> array = cs.inputconsolearray( bais, System.out);
        fail();
    }

    @Test(expected = ConsolStreamException.class)
    public void testConsolStreamExceptionIncorrectSize () {
    ByteArrayInputStream bais = new ByteArrayInputStream( "-1 \n   1\n   2\n     3".getBytes());
    ConsolStream<Integer> cs = new ConsolStream<>( Integer::valueOf);
    IArray<Integer> array = cs.inputconsolearray( bais, System.out);
    fail();
    }


    @Test
    public void testinputstream () {
        ByteArrayInputStream bais = new ByteArrayInputStream( "3 \n   1\n   2\n     3".getBytes());
        ConsolStream<Integer> cs = new ConsolStream<>( Integer::valueOf);
        IArray<Integer> array = cs.inputconsolearray( bais, System.out);
        for( int i=0; i<array.size(); ++i) {
            assertEquals((int) array.get(i), i + 1);
        }
    }
    @Test
    public void testinputstreamdouble () {
        ByteArrayInputStream bais = new ByteArrayInputStream( "3 \n  1.0\n2.0\n 3.0".getBytes());
        ConsolStream<Double> cs = new ConsolStream<>( Double::valueOf);
        IArray<Double> array = cs.inputconsolearray( bais, System.out);
        for( int i=0; i<array.size(); ++i) {
            assertEquals(array.get(i), i + 1.0);
        }
    }
}
