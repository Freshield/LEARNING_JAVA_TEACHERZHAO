import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/12.
 */
public class Question1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input one four-digit number: ");
        int input = scanner.nextInt();
        int thousands = input / 1000;
        int hundreds = input % 1000 / 100;
        int decade = input % 100 / 10;
        int unit = input % 10;
        System.out.println(thousands+"\n"+hundreds+"\n"+decade+"\n"+unit);
    }
}
