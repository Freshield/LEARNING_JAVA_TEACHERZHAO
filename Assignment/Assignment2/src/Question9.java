import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/21.
 */
public class Question9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input count between 0 to 100: ");
        int counter = scanner.nextInt();
        int number = 2;

        while (counter > 0) {
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number%i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(number);
                counter--;
            }
            number++;

        }
    }
}
