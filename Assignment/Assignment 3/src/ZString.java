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
//        System.out.println(lowercaseString(input,0));
//        System.out.println(capitalizedString(input));
        System.out.println(capitalizedStringAllParts(input));
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

    public String lowercaseString(String input, int begin) {

        String output = "";
        for (int i = begin; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                output += (char)(input.charAt(i)+32);
            } else {
                output += input.charAt(i);
            }
        }

        return output;
    }

    public String capitalizedString(String input) {
        String output = "";

        if (input.charAt(0) >= 'a' && input.charAt(0) <= 'z') {
            output += (char)(input.charAt(0)-32);
        } else {
            output += input.charAt(0);
        }

        output += lowercaseString(input,1);

        return output;

    }

    public String capitalizedStringAllParts(String input) {
        String output = input.charAt(0)+"";

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i-1) == 32 && input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                output += (char)(input.charAt(i)-32);
            } else {
                output += input.charAt(i);
            }
        }

        return output;
    }

}
