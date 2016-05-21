import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/21.
 */
public class Question5 {
    public static void main(String[] args) {

        int[] numbers = new int[6];
        int biggest = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input six number: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > biggest) {
                biggest = numbers[i];
            }
        }

        System.out.println(biggest);


    }
}
