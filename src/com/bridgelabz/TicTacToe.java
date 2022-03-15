package com.bridgelabz;

public class TicTacToe {

    public static void main(String[] args) {
        // welcome to Tic Tac Toe Program.

        char[] board = new char[10];
        int i;
        int j;
        for (i = 0; i <= 9; i++) {
            board[i] = ' ';
        }
        for (j = 1; j <= 9; j++) {
            System.out.print(board[j] + " | ");
            if (j % 3 == 0) {
                System.out.println();
            }
        }
    }
}
