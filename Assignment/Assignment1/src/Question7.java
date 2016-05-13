import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/12.
 */
public class Question7 {

    public static void main(String[] args) {

        System.out.print("Please input second: ");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();

        int minute = 60;
        int hour = minute * 60;
        int day = hour * 24;
        int month = day * 30;
        int result;
        String unit = new String();

        if (time >= month) {
            result = time / month;
            unit = "月";
        } else if (time >= day) {
            result = time / day;
            unit = "天";
        } else if (time >= hour) {
            result = time / hour;
            unit = "小时";
        } else if (time >= minute) {
            result = time / minute;
            unit = "分钟";
        } else {
            result = time;
            unit = "秒";
        }

        System.out.println(result+unit);
    }
}
