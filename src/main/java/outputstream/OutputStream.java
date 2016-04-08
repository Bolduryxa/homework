package outputstream;


import array.IArray;

import java.io.PrintStream;

/**
 *class array of outputs
 */
public class OutputStream {

    /**
     *displays the array to the console
     * @param printStream 'printStream'
     * @param array 'array'
     */
    public void outputstreaminconsol(final PrintStream printStream, final IArray array) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a[] = ");
        for (int index = 0; index < array.size(); index++) {
            stringBuilder.insert(2, index);
            stringBuilder.append(array.get(index));

            printStream.println(stringBuilder);

            int t = String.valueOf(index).length();
            stringBuilder.delete(2, 2 + String.valueOf(index).length());
            stringBuilder.delete(6, stringBuilder.length());
        }

    }
}
