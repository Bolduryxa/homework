package inputstream;
import array.IArray;
import array.arrayecxeption.ArrayException;

import array.Array;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *@param <T>
 */
public class ConsolStream<T> {
    /**
     *
     */

    private Handler<T> handler;

    /**
     *
     * @param handler ' handler'
     */

    public ConsolStream(final Handler<T> handler) {
        this.handler = handler;
    }

    /**
     *
     * @param inputStream 'inputStream'
     * @param printStream 'printStream'
     * @return 'array'
     */
    public IArray<T> inputconsolearray(final InputStream inputStream, final PrintStream printStream) {
        Scanner scanner = new Scanner(inputStream);
        int size = 0;
        try {
            printStream.println("Enter size ");
            size = scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new ConsolStreamException("Incorrect symbol", e);

        }

        IArray<T> array;
        try {
            array =  new Array(size);
        } catch (ArrayException e) {
            throw new ConsolStreamException("Incorrect size", e);
        }
        printStream.println("Full massiv ");
        for (int index = 0; index < size; index++) {



            T value;
            try {
                printStream.println("Enter value");
                value = handler.valueOf(scanner.next());
            } catch (InputMismatchException | NumberFormatException ex) {
                throw new ConsolStreamException("Incorrect symbol", ex);
            }

            array.set(index, value);

        }

      return array;
    }
}
