
package invertmassiv;


import array.IArray;

/**
 * This class inverts array
 */
public class InvertMassiv {

    /**
     *
     * @param array 'array '
     * @param <T>
     */
    public <T> void invert(final IArray<T> array) {

        for (int index = 0; index < array.size() / 2; index++) {

            T buf = array.get(index);
            array.set(index , array.get(((array.size() - 1) - index)));
            array.set(((array.size() - 1) - index), buf);

        }

    }
}
