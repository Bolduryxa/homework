package array;

/**
 * Interface for working with an array of
 * @param <T>
 */
public interface  IArray <T> {

     /**
      * get element
      * @param index index
      * @return element
      */
     T get(int index);

     /**
      *
      * @param index index
      * @param value value
      */
     void set(int index, T value);

     /**
      * set element
      * JavaDoc
      * @return size
      */
    /**
     * get size
     * @return size
     */
     int size();

}
