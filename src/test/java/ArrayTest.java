/**
 * Created by bolduryxa on 16.04.16.
 */
public class ArrayTest {
    private int[] array;
    public ArrayTest() {
         array = new int[]{1, 2, 3};
    }
     public int get (final int index) {
         return  array[index];

     }
    public void set (final int index,final int value) {
        array[index] = value;
    }
}
