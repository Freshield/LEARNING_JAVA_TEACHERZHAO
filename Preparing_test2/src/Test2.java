/**
 * Created by FRESHIELD on 2016/5/19.
 */
public class Test2 {
    public static void main(String[] args) {
        int[] array = {2,7,3,8,4};
        System.out.println("Question1");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println("Question2");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println("Question3");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }


    }
}
