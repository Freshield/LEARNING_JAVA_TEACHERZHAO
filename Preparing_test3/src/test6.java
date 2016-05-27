/**
 * Created by FRESHIELD on 2016/5/27.
 */
public class test6 {
    public static void main(String[] args) {
        new test6().run();
    }

    public void run() {
        int a = 1;
        System.out.println(a);
        a = f(a);
        System.out.println(a);
    }

    public int f(int a) {
        a++;
        System.out.println(a);
        return a;
    }
}