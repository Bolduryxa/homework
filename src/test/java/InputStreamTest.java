import array.IArray;
import inputstream.ConsolStream;
import inputstream.ConsolStreamException;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by bolduryxa on 16.04.16.
 */
public class InputStreamTest {


    @Test(expected = ConsolStreamException.class)
    public void testExceptionConsolStreamExceptionSize ( ) {
        ByteArrayInputStream bais = new ByteArrayInputStream( "A \n   1\n   2\n     3".getBytes());
        ConsolStream<Integer> cs = new ConsolStream<>( Integer::valueOf);
        IArray<Integer> array = cs.inputconsolearray( bais, System.out);

    }
    @Test(expected = ConsolStreamException.class)
    public void testExceptionConsolStreamExceptionValue ( ) {
        ByteArrayInputStream bais = new ByteArrayInputStream( "3 \n   A\n   2\n     3".getBytes());
        ConsolStream<Integer> cs = new ConsolStream<>( Integer::valueOf);
        IArray<Integer> array = cs.inputconsolearray( bais, System.out);

    }
@Test(expected = ConsolStreamException.class)
public void testConsolStreamExceptionIncorrectSize () {
    ByteArrayInputStream bais = new ByteArrayInputStream( "-1 \n   1\n   2\n     3".getBytes());
    ConsolStream<Integer> cs = new ConsolStream<>( Integer::valueOf);
    IArray<Integer> array = cs.inputconsolearray( bais, System.out);

}


    @Test
    public void testinputstream () {
        ByteArrayInputStream bais = new ByteArrayInputStream( "3 \n   1\n   2\n     3".getBytes());
        ConsolStream<Integer> cs = new ConsolStream<>( Integer::valueOf);
        IArray<Integer> array = cs.inputconsolearray( bais, System.out);
        for( int i=0; i<array.size(); ++i)
            assertEquals( (int) array.get( i), i+1);
    }
}
