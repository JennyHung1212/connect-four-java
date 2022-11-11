import solution.Connect4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Connect4 game = new Connect4();

        // Test case 1: check horizontally, winner: player 1
        int[][] board = new int[][]{
                {0,0,0,0,0,0},
                {0,1,1,1,1,0},
                {0,2,0,2,2,2},
                {2,2,1,2,0,2}
        };
        int winner = game.getWinner(board);
        System.out.print("Expected: " + 1);
        System.out.println(", Winner: " + winner);

        // Test case 2: check vertically, winner: player 1
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

        // Test case 3: check vertically,
        // winner: no winner, player 1 and 2 both meet the criteria but the number of discs is the same
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

        // Test case 4: check vertically,
        // winner: player 1, player 1 and 2 both meet the criteria but player 1 have more discs
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

        // Test case 5: check diagonally from upper left to lower right
        // winner: player 1
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

        // Test case 6: check diagonally from upper left to lower right
        // winner: player 2
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

        // Test case 7: check diagonally from upper left to lower right
        // winner: player 1
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

        // Test case 8: check diagonally from upper right to lower left
        // winner: player 2
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

        // Test case 9: check diagonally from upper left to lower right
        // winner: player 1
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

        // Test case 10: determine the winner with any dimensions of the board, players and winning condition
        game = new Connect4(3, 5);
        board = game.generateBoard(8, 8);
        for(int i = 0; i < 8; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        winner = game.getWinner(board);
        System.out.println("Winner: " + winner);
    }
}