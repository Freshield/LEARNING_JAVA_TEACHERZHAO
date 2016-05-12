import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/12.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");

        int a;
        a = 1;

        Scanner scanner = new Scanner(System.in);

//        int v3 = scanner.nextInt();
//        //String v4 = scanner.nextLine();
//        int v4 = scanner.nextInt();
//        System.out.println(v3+v4);
//
//        String v5 = scanner.nextLine();
//        System.out.println(v5);

        int v9 = (int)(1 + 1.0);

        int v10 = 11 % 3;

        boolean v12 = (3 > 5);

        System.out.println(v12);

        int va = scanner.nextInt();
        int vb = scanner.nextInt();

        if (va > vb) {
            System.out.println("va gt vb");
        }else {
            System.out.println("vb gt va");

        }

        double v13 = Math.random() * 10;//[0,10)


    }
}
