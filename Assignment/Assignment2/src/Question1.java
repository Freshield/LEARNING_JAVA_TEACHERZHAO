import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/20.
 */
public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        do {
            System.out.println("Please input a number between 0 to 9999: ");
            input = scanner.nextInt();

            int[] units = new int[4];
            int divesor = 1000;
            int counter = 4;

            //figure the digit number
            for (int i = 0; i < units.length; i++) {

                if ((input / divesor) != 0){
                    break;
                }
                counter--;
                divesor /= 10;
            }
            System.out.println(counter);

        }while (input != 233);


//        divesor = 1;
//        for (int i = 1; i < counter; i++) {
//            divesor *= 10;
//        }

        //get the units
//        for (int i = 0; i < counter; i++) {
//
//        }
    }
}
