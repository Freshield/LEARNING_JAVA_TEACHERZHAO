import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/12.
 */
public class Question2 {

    public static void main(String[] args) {

        System.out.print("Please input one number between 0 to 10000: ");
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        int middleput = (int)(input * 1000);
        if(middleput % 10 > 4){
            middleput += 10;
        }
        middleput /= 10;
        double output = middleput / 100.0;
        System.out.print(output);
        //figure out decimal
        if((int)(input*10) == input*10){
            System.out.println("0");
        }else {
            System.out.println();
        }
    }
}
