package Tasks_3;
import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 8};
        int[] array2 = new int[array1.length];
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

}