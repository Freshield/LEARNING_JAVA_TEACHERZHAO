import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/20.
 */
public class Question1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number between 0 to 9999: ");
        int input = scanner.nextInt();

        int unit;
        int divesor = 1000;
        int counter = 4;
        int digitNumber = 4;

        if (input == 0) {
            System.out.println(0);
        } else {

            //figure the digit number
            for (int i = 0; i < digitNumber; i++) {

                if ((input / divesor) != 0){
                    break;
                }
                counter--;
                divesor /= 10;
            }

            divesor = 1;

            for (int i = 1; i < counter; i++) {
                divesor *= 10;
            }

            //get the units and output
            for (int i = 0; i < counter; i++) {
                unit = input / divesor;
                input %= divesor;
                divesor /= 10;
                System.out.println(unit);
            }

        }
    }
}
