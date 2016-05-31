import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/21.
 */
public class Question10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int token = 1;
        do {
            System.out.println("请选择操作\n1.  加法\n2.  减法\n3.  乘法\n4.  除法\n0.  退出");
            token = scanner.nextInt();
            //figure if token in the menu
            double input1 = 0;
            double input2 = 0;
            if (token > 0 && token < 5) {
                System.out.println("请依次输入两个数");
                input1 = scanner.nextDouble();
                input2 = scanner.nextDouble();
            }



            switch (token) {
                case 1:
                    System.out.println(input1+" + "+input2+" = "+(input1+input2));
                    break;
                case 2:
                    System.out.println(input1+" - "+input2+" = "+(input1-input2));
                    break;
                case 3:
                    System.out.println(input1+" * "+input2+" = "+(input1*input2));
                    break;
                case 4:
                    System.out.println(input1+" / "+input2+" = "+(input1/input2));
                    break;
                default:
                    break;
            }
        }while (token != 0);

        System.out.println("欢迎下次再来哦");
    }
}
