import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/12.
 */
public class Jump {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double time = scanner.nextDouble();
        double height = 0.5 * 9.8 * time * time;
        int floors = (int)(height/2)+1;
        System.out.println(floors+" floor.");
    }
}
