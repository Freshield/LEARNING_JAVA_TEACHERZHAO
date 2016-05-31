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
//        String match = scanner.nextLine();
//        System.out.println(uppercaseString(input));
//        System.out.println(lowercaseString(input,0));
//        System.out.println(capitalizedString(input));
//        System.out.println(capitalizedStringAllParts(input));
//        System.out.println(hasPrefix(input,match));
//        System.out.println(hasSuffix(input,match));
//        System.out.println(isEqualToString(input,match));
//        System.out.println(isCaseInsensitiveEqualToString(input,match));
//        System.out.println(intValue(input));
//        System.out.println(stringEndWithSeperator(input));

//        String[] result = pathComponents(input);
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i] + i);
//        }

//        System.out.println(lastPathComponent(input));
//        System.out.println(stringByAddingSeperator(input));

        String component = scanner.nextLine();
        System.out.println(stringByAddingComponent(input,component));
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


        String output = uppercaseString(input.charAt(0)+"");

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i-1) == 32 && input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                output += (char)(input.charAt(i)-32);
            } else {
                output += input.charAt(i);
            }
        }

        return output;
    }

    public boolean hasPrefix(String input, String match) {

        boolean result = true;

        if (match.length() > input.length()) {
            result = false;
        } else {
            for (int i = 0; i< match.length(); i++) {
                if (match.charAt(i) != input.charAt(i)) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public boolean hasSuffix(String input, String match) {

        boolean result = true;
        int matchSuffix,inputSuffix;

        if (match.length() > input.length()) {
            result = false;
        } else {
            for (int i = 0; i< match.length(); i++) {
                matchSuffix = match.length() - i - 1;
                inputSuffix = input.length() - i - 1;
                if (match.charAt(matchSuffix) != input.charAt(inputSuffix)) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public boolean isEqualToString(String source, String target) {

        boolean result = true;

        if (source.length() != target.length()) {
            result = false;
        } else {
            for (int i = 0; i < source.length(); i++) {
                if (source.charAt(i) != target.charAt(i)) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    public boolean isCaseInsensitiveEqualToString(String source, String target) {
        boolean result = true;

        source = uppercaseString(source);
        target = uppercaseString(target);

        if (source.length() != target.length()) {
            result = false;
        } else {
            for (int i = 0; i < source.length(); i++) {
                if (source.charAt(i) != target.charAt(i)) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    public int intValue(String input) {
        int result = 0;
        int mutiplicator = 1;
        int inputSuffix;

        for (int i = 0; i < input.length(); i++) {
            inputSuffix = input.length() - i - 1;
            result += (input.charAt(inputSuffix) - '0') * mutiplicator;
            mutiplicator *= 10;
        }

        return result;
    }

    public boolean stringEndWithSeperator(String input) {
        boolean result = true;

        if (input.charAt(input.length() - 1) != '/') {
            result = false;
        }

        return result;
    }

    public String[] pathComponents(String input) {

        return input.split("/");
    }

    public String lastPathComponent(String input) {
        String[] result = input.split("/");
        return  result[result.length - 1];
    }

    public String stringByAddingSeperator(String input) {
        if (input.charAt(input.length() - 1) != '/') {
            return input += "/";
        } else {
            return input;
        }
    }

    public String stringByAddingComponent(String first, String second) {
        first = stringByAddingSeperator(first);
        return first + second;
    }

}
