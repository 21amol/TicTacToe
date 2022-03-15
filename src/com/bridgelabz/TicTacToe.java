package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {

    static void chooseLetter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Letter entered by Player x or o");
        char player = sc.next().charAt(0);
        char computer = ' ';

        if (player == 'x') {
            computer = 'o';
            System.out.println("Computer choose: " + computer);

        } else {
            computer = 'x';
            System.out.println("Computer choose: " + computer);
        }
        System.out.println("Player: " + player);
        System.out.println("Computer: " + computer);

    }

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
        chooseLetter();
    }

}
