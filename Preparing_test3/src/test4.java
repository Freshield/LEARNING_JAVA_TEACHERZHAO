/**
 * Created by FRESHIELD on 2016/5/27.
 */
public class test4 {
    public static void main(String[] args) {
        new test4().run();
    }

    public void run() {
        int a = 0;
        a++;
        System.out.println(a);
        f();
        System.out.println(a);
        a++;
        System.out.println(a);
    }

    public void f() {
        int a = 10;
        System.out.println(a);
    }
}
