import solution.Connect4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Connect4 game = new Connect4();

        int[][] board = new int[][]{
                {0,0,0,0,0,0},
                {0,1,1,1,1,0},
                {0,2,0,2,2,2},
                {2,2,1,2,0,2}
        };
        int winner = game.getWinner(board);
        System.out.print("Expected: " + 1);
        System.out.println(", Winner: " + winner);

        board = new int[][]{
                {0,0,0,0,0},
                {0,1,2,1,2},
                {0,2,2,1,2},
                {0,1,2,1,0},
                {0,0,0,1,0}
        };
        winner = game.getWinner(board);
        System.out.print("Expected: " + 1);
        System.out.println(", Winner: " + winner);

        board = new int[][]{
                {0,0,0,0,0},
                {0,1,2,1,2},
                {0,2,2,1,2},
                {0,1,2,1,0},
                {0,0,2,1,0}
        };
        winner = game.getWinner(board);
        System.out.print("Expected: " + -1);
        System.out.println(", Winner: " + winner);

        board = new int[][]{
                {0,0,0,1,0},
                {0,1,2,1,2},
                {0,2,2,1,2},
                {0,1,2,1,0},
                {0,0,2,1,0}
        };
        winner = game.getWinner(board);
        System.out.print("Expected: " + 1);
        System.out.println(", Winner: " + winner);

        board = new int[][]{
                {0,0,0,0,0},
                {0,1,0,2,0},
                {0,1,1,2,0},
                {0,2,2,1,0},
                {0,2,0,2,1}
        };
        winner = game.getWinner(board);
        System.out.print("Expected: " + 1);
        System.out.println(", Winner: " + winner);

        board = new int[][]{
                {0,2,0,0,0},
                {0,1,2,0,0},
                {0,1,1,2,0},
                {0,2,2,1,2},
                {0,2,0,2,2}
        };
        winner = game.getWinner(board);
        System.out.print("Expected: " + 2);
        System.out.println(", Winner: " + winner);

        board = new int[][]{
                {0,0,0,0,0},
                {1,0,0,0,0},
                {0,1,2,2,0},
                {0,2,1,2,2},
                {0,2,0,1,0}
        };
        winner = game.getWinner(board);
        System.out.print("Expected: " + 1);
        System.out.println(", Winner: " + winner);

        board = new int[][]{
                {0,0,0,0,0},
                {0,0,0,2,0},
                {0,1,2,2,0},
                {0,2,1,2,2},
                {2,2,1,1,0}
        };
        winner = game.getWinner(board);
        System.out.print("Expected: " + 2);
        System.out.println(", Winner: " + winner);

        board = new int[][]{
                {0,0,0,1,0},
                {0,0,1,2,0},
                {0,1,2,2,0},
                {1,2,1,2,2},
                {0,2,1,1,0}
        };
        winner = game.getWinner(board);
        System.out.print("Expected: " + 1);
        System.out.println(", Winner: " + winner);

        game = new Connect4(3, 5);
        board = game.generateBoard(8, 8);
        for(int i = 0; i < 8; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        winner = game.getWinner(board);
        System.out.println("Winner: " + winner);

    }
}