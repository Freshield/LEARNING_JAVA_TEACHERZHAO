import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/12.
 */
public class Question5 {

    public static void main(String[] args) {

        System.out.print("Please input three number between 0 to 9999: ");
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        int lagest;

        if (input1 > input2){
            lagest = input1;
        }else {
            lagest = input2;
        }

        if (input3 > lagest){
            lagest = input3;
        }

        System.out.println(lagest);
    }
}
