/**
 * Created by Zhaozhe on 5/19/16.
 */
public class Matrix {
    public static void main(String[] args) {
        int[][] matrix;

        matrix = sourceMatrix();
        printIcons(matrix);

        matrix = sourceMatrix();
        fill(matrix);

        matrix = sourceMatrix();
        rollToRight(matrix);

        matrix = sourceMatrix();
        rollToTop(matrix);

        matrix = sourceMatrix();
        pushToRight(matrix);

        matrix = sourceMatrix();
        pushToTop(matrix);

        matrix = sourceMatrix();
        flipHorizontally(matrix);

        matrix = sourceMatrix();
        flipVertically(matrix);

        matrix = sourceMatrix();
        rollToRight(matrix);

        matrix = sourceMatrix();
        rotateLeft(matrix);

        matrix = sourceMatrix();
        match(matrix);

    }


    public static int[][] sourceMatrix(){
        int[][] matrix = {
                {0, 1, 2, 3},
                {1, 0, 0, 3},
                {1, 1, 1, 3},
                {1, 2, 3, 0}
        };
        return matrix;
    }

    /*
     *  .   要求
     *      把数据转换为图形字符输出
     *      0 -> .
     *      1 -> X
     *      2 -> @
     *      3 -> #
     *      4 -> O
     *      5 -> %
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      . X @ #
     *      X . . #
     *      X X X #
     *      X @ # .
     */
    public static void printIcons(int[][] matrix) {

    }

    /*
     *  .   要求
     *      把数据里是 0 的地方, 随机补充 1 - 5 的数字
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      1 1 2 3
     *      1 5 4 3
     *      1 1 1 3
     *      1 2 3 2
     */
    public static void fill(int[][] matrix) {

    }

    /*
     *  .   要求
     *      向右侧翻滚一格, 最右侧变为最左侧
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      3 0 1 2
     *      3 1 0 0
     *      3 1 1 1
     *      0 1 2 3
     */
    public static void rollToRight(int[][] matrix) {

    }

    /*
     *  .   要求
     *      向上侧翻滚一格, 最上侧变为最下侧
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      0 1 2 3
     */
    public static void rollToTop(int[][] matrix) {

    }

    /*
     *  .   要求
     *      把非 0 数据推向右侧
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      0 1 2 3
     *      0 0 1 3
     *      1 1 1 3
     *      0 1 2 3
     */
    public static void pushToRight(int[][] matrix) {

    }

    /*
     *  .   要求
     *      把非 0 数据推向上侧
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      1 1 2 3
     *      1 1 1 3
     *      1 2 3 3
     *      0 0 0 0
     */
    public static void pushToTop(int[][] matrix) {

    }

    /*
     *  .   要求
     *      把数据横向翻转
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      3 2 1 0
     *      3 0 0 1
     *      3 1 1 1
     *      0 3 2 1
     */
    public static void flipHorizontally(int[][] matrix) {

    }

    /*
     *  .   要求
     *      把数据纵向翻转
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      1 2 3 0
     *      1 1 1 3
     *      1 0 0 3
     *      0 1 2 3
     */
    public static void flipVertically(int[][] matrix) {

    }

    /*
     *  .   要求
     *      把数据向右旋转
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      1 1 1 0
     *      2 1 0 1
     *      3 1 0 2
     *      0 3 3 3
     */
    public static void rotateRight(int[][] matrix) {

    }

    /*
     *  .   要求
     *      把数据向左旋转
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      3 3 3 0
     *      2 0 1 3
     *      1 0 1 2
     *      0 1 1 1
     */
    public static void rotateLeft(int[][] matrix) {

    }

    /*
     *  .   要求
     *      消除任意横向或纵向有连续三个相同的非0数据
     *      并输出
     *
     *  .   效果
     *      matrix
     *      0 1 2 3
     *      1 0 0 3
     *      1 1 1 3
     *      1 2 3 0
     *      <<
     *      0 1 2 0
     *      0 0 0 0
     *      0 0 0 0
     *      0 2 3 0
     */
    public static void match(int[][] matrix) {

    }
}
