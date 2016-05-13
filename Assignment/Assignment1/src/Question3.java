import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/12.
 */
public class Question3 {

    public static void main(String[] args) {

        System.out.print("Please input one number between 0 to 9999: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String fill = new String();
        if (input / 10 == 0) {
            fill = "000";
        }else if (input / 100 == 0) {
            fill = "00";
        }else if (input / 1000 == 0) {
            fill = "0";
        }else {
            fill = "";
        }

        System.out.println(fill+input);

    }
}
