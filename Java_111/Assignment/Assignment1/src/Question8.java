import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/13.
 */
public class Question8 {

    public static void main(String[] args) {

        System.out.print("Please input first people's ATK DEF DEX AGL: ");
        Scanner scanner = new Scanner(System.in);
        int ATK1 = scanner.nextInt();
        int DEF1 = scanner.nextInt();
        int DEX1 = scanner.nextInt();
        int AGL1 = scanner.nextInt();

        System.out.print("Please input second people's ATK DEF DEX AGL: ");
        int ATK2 = scanner.nextInt();
        int DEF2 = scanner.nextInt();
        int DEX2 = scanner.nextInt();
        int AGL2 = scanner.nextInt();

        double hit;

        double trueDEX1 = (double)DEX1 * (1+((Math.random()*40 - 20)/100));
        double trueAGL2 = (double)AGL2 * (1+((Math.random()*40 - 20)/100));
//        System.out.println("The trueDEX1 is: "+trueDEX1+",the trueAGL2 is: "+trueAGL2);

        //precalculate
        if (ATK1 > DEF2) {
            hit = (double)(ATK1 - DEF2);
        } else {
            hit = 1;
        }
        //figure crit or miss
        double element;
        if (trueDEX1 > (trueAGL2 * 2)) {
            element = 2;
        } else if (trueDEX1 < (trueAGL2 * 0.5)) {
            element = 0;
        } else {
            element = 1+((Math.random()*20 - 10)/100);
        }
//        System.out.println("The element is: "+element+", the hit is: "+hit);

        //final calculate
        int result = (int)(hit * element);

        System.out.println("The first people hit the second people by: "+result);


    }
}
