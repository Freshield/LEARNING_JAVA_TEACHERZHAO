import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/21.
 */
public class Question2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a double type number greater than 0: ");
        double input = scanner.nextDouble();

        int counter = 6;
        int digitNumber = 6;
        int beforePoint = (int)input;
        int afterPoint = (int)(input*1000000)-beforePoint*1000000;
        int divesor = 10;
//        System.out.println(input+" : "+beforePoint+" : "+afterPoint);

        if (afterPoint == 0) {
            System.out.println(beforePoint+".000000");
        } else {
            //figure the digit number
            for (int i = 0; i < digitNumber; i++) {

                if ((afterPoint % divesor) != 0){
                    break;
                }
                counter--;
                divesor *= 10;
            }

            divesor /= 10;
            afterPoint /= divesor;
            System.out.print(beforePoint+"."+afterPoint);

            //print more 0
            for (int i = 1; i < divesor; i++) {
                System.out.print(0);
                divesor /= 10;
            }


        }

    }
}
