import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/12.
 */
public class Question6 {

    public static void main(String[] args) {
        System.out.print("Please input four number of coordinate: ");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);

        System.out.println("Width is "+width+", Height is "+height);

    }
}
