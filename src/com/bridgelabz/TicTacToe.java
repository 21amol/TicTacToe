package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {

    static final int HEAD = 1;
    static final int TAIL = 0;

    static char[] board = new char[10];

    static void gameCheck() {
        int won = 0;
        for (int i = 1; i <= 9; i++) {
            // if(i==1 || i==2 || i==3) {
            if (board[i] == board[i + 1] && board[i] == board[i + 2] && board[i] == player) {
                System.out.println("Player Won");
                won = 1;
                break;
            } else if (board[i] == board[i + 3] && board[i] == board[i + 6] && board[i] == player) {
                System.out.println("Player Won");
                won = 1;
                break;
            } else if (board[i] == board[i + 4] && board[i] == board[i + 8] && board[i] == player) {
                System.out.println("Player Won");
                won = 1;
                break;
            } else if (board[i] == board[i + 1] && board[i] == board[i + 2] && board[i] == computer) {
                System.out.println("Computer Won");
                won = 2;
                break;
            } else if (board[i] == board[i + 3] && board[i] == board[i + 6] && board[i] == computer) {
                System.out.println("Computer Won");
                won = 2;
                break;
            } else if (board[i] == board[i + 4] && board[i] == board[i + 8] && board[i] == computer) {
                System.out.println("Computer Won");
                won = 2;
                break;
            }
            if (won == 0) {
                System.out.println("Game is still Onn...");
            }
        }
    }


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
    static char computer;

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
        gameCheck();
    }

}
