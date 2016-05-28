import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/29.
 */
public class ZString {

    public static void main(String[] args) {
        new ZString().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input some words: ");
        String input = scanner.nextLine();
//        System.out.println(uppercaseString(input));
        System.out.println(lowercaseString(input));
    }

    public String uppercaseString(String input) {

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                output += (char)(input.charAt(i)-32);
            } else {
                output += input.charAt(i);
            }
        }

        return output;
    }

    public String lowercaseString(String input) {

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                output += (char)(input.charAt(i)+32);
            } else {
                output += input.charAt(i);
            }
        }

        return output;
    }

}
