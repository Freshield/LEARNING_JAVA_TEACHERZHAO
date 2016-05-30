import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/5/30.
 */
public class Five {

    int horizontal = 15;
    int veritical = 15;
    //avoid the edge problem
    int start = 4;
    String[][] chessboard = new String[veritical + start*2][horizontal + start*2];
    int[] numberLine = new int[horizontal];
    String[] wordLine = new String[veritical];

    public static void main(String[] args) {
        new Five().run();
    }

    public void run() {

        //init numberLine
        for (int i = 0; i < horizontal; i++) {
            numberLine[i] = i + 1;
        }

        //init wordLine
        for (int i = 0; i < veritical; i++) {
            wordLine[i] = (char)('A' + i) + "";
        }

        //init chessboard
        for (int i = 0; i < veritical + start*2; i++) {
            for (int j = 0; j < horizontal + start*2; j++) {
                chessboard[i][j] = ".";
            }
        }

//        chessboard[5+start][5+start] = "x";

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入玩家1姓名");
        String player1 = scanner.nextLine();
        System.out.println("输入玩家2姓名");
        String player2 = scanner.nextLine();
        System.out.println("游戏开始");

        printChessboard();

        //1 is play1,-1 is play2
        int playerNow = 1;
        boolean key = true;
        String pieces = ".";
        String playerName;

        while (key) {

            //figure the play
            if (playerNow == 1) {
                playerName = player1;

                pieces = "x";
            } else {
                playerName = player2;
                pieces = "o";
            }

            System.out.println("请 "+playerName+" 下棋");
            String position = scanner.nextLine();

            int positionVeritical = position.charAt(0) - 'A' + start;
            int positionHorizontal = Integer.valueOf(position.substring(1)) - 1 + start;



            //figure position
            if (chessboard[positionVeritical][positionHorizontal] != ".") {
                System.out.println("错误，已经有棋子了");
            } else {
                chessboard[positionVeritical][positionHorizontal] = pieces;
                printChessboard();

                //figure win or not
                boolean result = checkResult(positionVeritical,positionHorizontal,pieces);
                if (result == true) {
                    System.out.println(playerName+" 赢了");
                    key = false;
                } else {
                    playerNow *= -1;
                }
            }
        }




    }

    public boolean checkResult(int veritical,int horizontal,String pieces) {
        boolean result = false;
        int counter;

        //for north south
        for (int i = 0; i < 5; i++) {
            counter = 0;
            for (int j = 0; j < 5; j++) {
                if (chessboard[veritical -j + i][horizontal] == pieces) {
                    counter ++;
                }
            }
            if (counter == 5) {
                result = true;
                return result;
            }

        }
        //for west east
        for (int i = 0; i < 5; i++) {
            counter = 0;
            for (int j = 0; j < 5; j++) {
                if (chessboard[veritical][horizontal -j + i] == pieces) {
                    counter ++;
                }
            }
            if (counter == 5) {
                result = true;
                return result;
            }

        }
        //for northeast southwest
        for (int i = 0; i < 5; i++) {
            counter = 0;
            for (int j = 0; j < 5; j++) {
                if (chessboard[veritical - j + i][horizontal -j + i] == pieces) {
                    counter ++;
                }
            }
            if (counter == 5) {
                result = true;
                return result;
            }

        }
        //for northwest southeast
        for (int i = 0; i < 5; i++) {
            counter = 0;
            for (int j = 0; j < 5; j++) {
                if (chessboard[veritical - i + j][horizontal -j + i] == pieces) {
                    counter ++;
                }
            }
            if (counter == 5) {
                result = true;
                return result;
            }

        }


        return result;
    }



    public void printChessboard() {
        System.out.print("  ");
        //print numberLine
        for (int i = 0; i < horizontal; i++) {
            if (i < 9) {
                System.out.print("0");
            }
            System.out.print(numberLine[i]+" ");
        }
        System.out.println("");
        //print others
        for (int i = 0; i < veritical; i++) {
            System.out.print(wordLine[i]+" ");
            for (int j = 0; j < horizontal; j++) {
                System.out.print(chessboard[i+start][j+start] + "  ");

            }
            System.out.println("");
        }

    }


}
