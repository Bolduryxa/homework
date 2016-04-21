import array.IArray;
import inputstream.ConsolStream;
import inputstream.ConsolStreamException;
import invertmassiv.InvertMassiv;
import outputstream.OutputStream;

import java.io.InputStream;
import java.io.PrintStream;

/**
 *
 */
public  class Main {
    /**
     *
     * @param arg ' arg'
     */
    public static  void main(final String[] arg) {
        InputStream streaminput = System.in;
        PrintStream printStream = System.out;


        ConsolStream<Integer> stream = new ConsolStream<>(Integer::valueOf);
        /*ConsolStream<Integer> stream = new ConsolStream<>(new Handler<Integer>() {
            @Override
            public Integer valueOf(String str) {
                return Integer.valueOf( str);
            }
        });*/
     

        try {

            IArray<Integer> array = stream.inputconsolearray(streaminput, printStream);
            InvertMassiv invertObject = new InvertMassiv();
            invertObject.invert(array);
            OutputStream outputstream = new OutputStream();
            outputstream.outputstreaminconsol(printStream, array);
        } catch (ConsolStreamException e) {
            printStream.println(e.getMessage());
        }

    }


}
