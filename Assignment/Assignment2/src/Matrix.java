/**
 * Created by Zhaozhe on 5/19/16.
 */
public class Matrix {
    public static void main(String[] args) {
//        printIcons(sourceMatrix());
//        fill(sourceMatrix());
//        rollToRight(sourceMatrix());
//        rollToTop(sourceMatrix());
//        pushToRight(sourceMatrix());
//        pushToTop(sourceMatrix());
//        flipHorizontally(sourceMatrix());
//        flipVertically(sourceMatrix());
//        rotateRight(sourceMatrix());
//        rotateLeft(sourceMatrix());
        match(sourceMatrix());
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
        String[] icons = {".","X","@","#","O","%"};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(icons[matrix[i][j]]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
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
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == 0) {
                    System.out.print((int)(Math.random()*5)+1);
                } else {
                    System.out.print(matrix[i][j]);
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
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

        for (int i = 0; i < 4; i++) {
            int temp = matrix[i][3];
            for (int j = 0; j < 4; j++) {
                if ((3 - j) != 0) {
                    matrix[i][3 - j] = matrix[i][3 - j - 1];
                } else {
                    matrix[i][3 - j] = temp;
                }

            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
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

        for (int i = 0; i < 4; i++) {
            int temp = matrix[0][i];
            for (int j = 0; j < 4; j++) {
                if (j != 3) {
                    matrix[j][i] = matrix[j + 1][i];
                } else {
                    matrix[j][i] = temp;
                }

            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

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
        //find each line not zero number
        for (int i = 0; i < 4; i++) {
            //figure the number of not zero number
            int counter = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] != 0) {
                    counter++;
                }
            }
            //push not zero number into array
            int[] tempArray = new int[counter];
            counter = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] != 0) {
                    tempArray[counter] = matrix[i][j];
                    counter++;
                }
            }
            //reorgnize matrix
            int tempCount = 0;
            for (tempCount = 0; tempCount < 4 - counter; tempCount++) {
                matrix[i][tempCount] = 0;
            }
            counter = 0;
            for (;tempCount < 4; tempCount++) {
                matrix[i][tempCount] = tempArray[counter];
                counter++;
            }

        }
        //output
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
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
     *      0 1 2 3
     *      0 0 1 3
     *      1 1 1 3
     *      0 1 2 3
     */
    public static void pushToTop(int[][] matrix) {
        //find each line not zero number
        for (int i = 0; i < 4; i++) {
            //figure the number of not zero number
            int counter = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[j][i] != 0) {
                    counter++;
                }
            }
            //push not zero number into array
            int[] tempArray = new int[counter];
            counter = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[j][i] != 0) {
                    tempArray[counter] = matrix[j][i];
                    counter++;
                }
            }
            //reorgnize matrix
            int tempCount = 0;
            for (tempCount = 0; tempCount < 4 - counter; tempCount++) {
                matrix[3 - tempCount][i] = 0;
            }
            counter = 3 - tempCount;
            for (;tempCount < 4; tempCount++) {
                matrix[3 - tempCount][i] = tempArray[counter];
                counter--;
            }

        }
        //output
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

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
        //flip
        for (int i = 0; i < 4; i++) {
            int temp;
            for (int j = 0; j < 4 / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][3 - j];
                matrix[i][3 - j] = temp;
            }
        }
        //output
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

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
        //flip
        for (int i = 0; i < 4; i++) {
            int temp;
            for (int j = 0; j < 4 / 2; j++) {
                temp = matrix[j][i];
                matrix[j][i] = matrix[3 - j][i];
                matrix[3 - j][i] = temp;
            }
        }
        //output
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

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

        int[][] tempMatrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tempMatrix[j][i] = matrix[3 - i][j];
            }
        }
        //output
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(tempMatrix[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

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

        int[][] tempMatrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tempMatrix[j][i] = matrix[i][3 - j];
            }
        }
        //output
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(tempMatrix[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

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
        int[][] tempArray = new int[4][4];
        //init tempArray
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tempArray[i][j] = 1;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //for horizontally
                if (j < 2) {
                    if ((matrix[i][j] == matrix[i][j+1]) && (matrix[i][j+1] == matrix[i][j+2])) {
                        tempArray[i][j] = 0;
                        tempArray[i][j+1] = 0;
                        tempArray[i][j+2] = 0;
                    }
                }

                //for veritically
                if (i < 2) {
                    if ((matrix[i][j] == matrix[i+1][j]) && (matrix[i+1][j] == matrix[i+2][j])) {
                        tempArray[i][j] = 0;
                        tempArray[i+1][j] = 0;
                        tempArray[i+2][j] = 0;
                    }
                }

            }
        }
        //output
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]*tempArray[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}
