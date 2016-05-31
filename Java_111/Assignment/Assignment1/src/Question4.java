import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/12.
 */
public class Question4 {

    public static void main(String[] args) {

        System.out.print("Please input one number from 0 to 5: ");
        String[] library = {"-----",".----","..---","...--","....-","....."};
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(library[input]);
    }
}
