import array.IArray;
import inputstream.ConcolStream;
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
     * @param arg .
     */
    public static  void main(final String[] arg) {
        InputStream streaminput = System.in;
        PrintStream printStream = System.out;


        ConcolStream<Integer> stream = new ConcolStream<>(Integer::valueOf);
        /*ConcolStream<Integer> stream = new ConcolStream<>(new Handler<Integer>() {
            @Override
            public Integer valueOf(String str) {
                return Integer.valueOf( str);
            }
        });*/
        //ConcolStream<Integer> stream = new ConcolStream<>(new IntegerHandler());



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
