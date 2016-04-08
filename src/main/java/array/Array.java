package array;

import array.arrayecxeption.ArrayException;

/**
 *Creating an array and work with him
 * @param <T>
 */
public class Array  <T> implements IArray<T> {


    private final static int defaultsize = 16;
    private Object[] array;

    /**
     *creating an array of size  'defaultsize'
     */
    public Array() {

        this(defaultsize);
    }

    /**
     *creating an array of size 'size'
     * @param size 'size'
     */
    public Array(final int size) {

        array = null;
        resize(size);
    }

    /**
     *increasing the size of the array
     * @param size 'size'
     */
    private  void resize(final int size) {

        if (size <= 0 || (array != null && array.length < size)) {
            throw new ArrayException();
        }

        Object[] arr = new Object[size];

        if (array != null) {

            for (int i = 0; i < array.length; ++i) {
                arr[i] =  array[i];
            }
        }
         this.array =  arr;
   }

    /**
     *get element
     * @param index .
     * @return (T) array[index]
     */
    public T get(final int  index) {
        try {
            return (T) array[index];
        } catch (IndexOutOfBoundsException e) {
            throw new ArrayException(e);
        }
    }

    /**
     * set element
     * @param index .
     * @param value .
     */
    public void set(final int index, final T value) {
        try {
            array[index] =  value;
        } catch (IndexOutOfBoundsException e) {
            throw new ArrayException(e);
        }
    }



    /**
     *get size 'array.length'
     * @return length
     */
    public int size() {
        return array.length;
    }
}
