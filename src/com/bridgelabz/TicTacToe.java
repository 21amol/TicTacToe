package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {

    static final int HEAD = 1;
    static final int TAIL = 0;

    static char[] board = new char[10];


    static void toss() {
        int toss = (int) Math.floor(Math.random() * 10) % 2;
        if (toss == HEAD) {
            System.out.println("Player won and will start start first.");
        } else {
            System.out.println("Computer won and will start first");
        }
    }


    static void makeMove() {

        for (int i = 1; i <= 9; ) {
            System.out.println("Enter the position you want to fill (1,2,3,4,5,6,7,8,9): ");
            int position = sc.nextInt();
            if (position <= 9) {
                if (board[position] == ' ') {
                    System.out.println("Move is possible, position is free");
                    board[position] = player;
                    // Making Move
                    for (int j = 1; j <= 9; j++) {
                        System.out.print(board[j] + " | ");
                        if (j % 3 == 0) {
                            System.out.println();
                        }
                    }
                } else {
                    System.out.println("Position is already filled, Enter new position");
                }

            } else if (position > 9) {
                System.out.println("Enter position from 1 to 9");
            }
            i++;
        }
    }

    static void showBoard() {
        System.out.println("Current board looks like this");
        for (int j = 1; j <= 9; j++) {
            System.out.print(board[j] + " | ");
            if (j % 3 == 0) {
                System.out.println();
            }
        }
    }

    static void chooseLetter() {
        System.out.println("Letter entered by Player x or o");
        player = sc.next().charAt(0);
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

    static Scanner sc = new Scanner(System.in);
    static char player;

    public static void main(String[] args) {
        // welcome to Tic Tac Toe Program.

        for (int i = 0; i <= 9; i++) {
            board[i] = ' ';
        }
        for (int j = 1; j <= 9; j++) {
            System.out.print(board[j] + " | ");
            if (j % 3 == 0) {
                System.out.println();
                System.out.println(" ____________ ");
            }
        }
        chooseLetter();
        showBoard();
        toss();
        makeMove();
    }

}
