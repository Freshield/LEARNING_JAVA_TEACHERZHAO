import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/12.
 */
public class Score {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your grad:");
        int score = scanner.nextInt();
        String grade = new String();

        if (score < 60) {
            grade = "F";
        } else if (score < 70) {
            grade = "C";
        } else if (score < 85) {
            grade = "B";
        } else if (score < 100) {
            grade = "A";
        } else {
            grade = "Error";
        }

        System.out.println(grade);
    }
}
