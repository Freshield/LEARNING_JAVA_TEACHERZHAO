/**
 * Created by FRESHIELD on 2016/5/27.
 */
public class Mathematics {
    public static void main(String[] args) {
        new Mathematics().run();
    }

    public void run() {

//        double out = round(3.552);
//        double out = max(12,13);
//        double out = min(12,13);
//        int out = floor(12.3);
        int out = ceil(12.1);
        System.out.println(out);
    }

    public double abs(double input) {
        if (input < 0) {
            input *= -1;
        }
        return input;
    }

    public double round(double input) {
        int firstPoint = ((int)(input * 10 % 10));
        int beforePoint = (int)input;
        if (firstPoint > 4) {
            beforePoint++;
        }
        return beforePoint;
    }

    public double max(double input1, double input2) {
        if (input1 > input2) {
            return input1;
        } else {
            return input2;
        }
    }

    public double min(double input1, double input2) {
        if (input1 < input2) {
            return input1;
        } else {
            return input2;
        }
    }

    public int floor(double input) {
        return (int)(input);
    }

    public int ceil(double input) {
        if (input > ((int)input)) {
            return ((int)input+1);
        } else {
            return (int)input;
        }
    }
}
