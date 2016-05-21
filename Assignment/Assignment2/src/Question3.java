import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/21.
 */
public class Question3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number between 0 to 9999: ");
        int input = scanner.nextInt();
        System.out.println("Please input the digit number you want: ");
        int digitNumber = scanner.nextInt();

        int divesor = 1000;
        int biggestNumber = 4;
        int counter = biggestNumber;

        //figure the digit number
        for (int i = 0; i < biggestNumber; i++) {

            if ((input / divesor) != 0){
                break;
            }
            counter--;
            divesor /= 10;
        }

//        System.out.println(divesor+" : "+counter);

        //output
        if (digitNumber <= counter) {
            System.out.println(input);
        } else {
            for (int i = 0; i < (digitNumber - counter); i++) {
                System.out.print(0);
            }
            if (input != 0) {
                System.out.println(input);
            }
        }

    }
}
