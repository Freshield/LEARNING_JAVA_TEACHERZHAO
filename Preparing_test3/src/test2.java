/**
 * Created by FRESHIELD on 2016/5/22.
 */
import java.util.*;
public class test2 {
    public static void main(String[] args) {
        new test2().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        printMenu();

        int command = scanner.nextInt();

        while (command != 0){
            double value1 = scanner.nextDouble();
            double value2 = scanner.nextDouble();
            double result = 0.0;

            if (command == 1) {
                result = value1 + value2;

            } else if (command == 2) {
                result = value1 - value2;

            } else if (command == 3) {
                result = value1 * value2;

            } else if (command == 4) {
                result = value1 / value2;
            }

            System.out.println(result);

            printMenu();

            command = scanner.nextInt();
        }
    }

    public void printMenu() {
        System.out.println("请选择操作");
        System.out.println("1.  加法");
        System.out.println("2.  减法");
        System.out.println("3.  乘法");
        System.out.println("4.  除法");
        System.out.println("0.  退出");
    }
}
