package com.bridgelabz;
import java.util.Scanner;

public class TicTacToe {

        static char [] board = new char[10];

        static char playerSymbol;
        static char computerSymbol;

        static void createBoard() {
            for(int i=1; i<board.length; i++) {
                board[i] = ' ';
            }
            System.out.println("board is created");
        }

        static void assignSymbol(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your letter (X or O): ");
            playerSymbol = sc.next().charAt(0);
            if(playerSymbol == 'X' || playerSymbol == 'x'){
                computerSymbol = 'O';
            }else if(playerSymbol == 'O' || playerSymbol == 'o'){
                computerSymbol = 'X';
            }else{
                System.out.println("Invalid input");
                assignSymbol();
            }
        }
        static void showBoard(){
            System.out.println("-_-_-_-_-_-_-_-_-_-");
            System.out.println(board[1] +" | "+ board[2] + " | " + board[3]);
            System.out.println("----------");
            System.out.println(board[4] +" | "+ board[5] + " | " + board[6]);
            System.out.println("----------");
            System.out.println(board[7] +" | "+ board[8] + " | " + board[9]);
            System.out.println(" ");
        }
        static void userInput(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose the position b/w (1 to 9): ");
            int user = sc.nextInt();
            if(user > 9 || user < 1){
                System.out.println("Invalid input: ");
                userInput();
            }
            if(board[user] == ' '){
                board[user] = playerSymbol;
            }else{
                System.out.println("Its not Empty");
                userInput();
            }
            if(checkWinner(playerSymbol)){
                System.out.println("Player wins.");

            }else{
                doCheck(playerSymbol);
                showBoard();
                System.out.println("Computers chance: ");
                computerInput();
            }
        }
        static void computerInput(){
            int computerMove = (int) (Math.random() * 9 + 1);
            if(board[computerMove] == ' '){
                board[computerMove] = computerSymbol;
            }else{
                System.out.println("Its not Empty");
                computerInput();
            }
            if(checkWinner(computerSymbol)){
                System.out.println("Computer wins.");

            }else{
                doCheck(computerSymbol);
                showBoard();
                System.out.println("Player chance: ");
                userInput();
            }
        }
        static boolean checkWinner(char symbol) {
            if ((board[1] == symbol && board[2] == symbol && board[3] == symbol) ||
                    (board[1] == symbol && board[4] == symbol && board[7] == symbol) ||
                    (board[1] == symbol && board[5] == symbol && board[9] == symbol) ||
                    (board[2] == symbol && board[5] == symbol && board[8] == symbol) ||
                    (board[3] == symbol && board[6] == symbol && board[9] == symbol) ||
                    (board[3] == symbol && board[5] == symbol && board[7] == symbol) ||
                    (board[4] == symbol && board[5] == symbol && board[6] == symbol) ||
                    (board[7] == symbol && board[8] == symbol && board[9] == symbol)) {
                showBoard();
                return true;
            }
            return false;
        }

        static void doCheck(char symbol) {
            if (board[1] != ' ' && board[2] != ' ' && board[3] != ' ' &&
                    board[4] != ' ' && board[5] != ' ' && board[6] != ' ' &&
                    board[7] != ' ' && board[8] != ' ' && board[9] != ' ' &&
                    checkWinner(symbol)==false) {
                System.out.println("game is ended while check");
                showBoard();
                System.exit(0);
            }
        }
    static boolean computerAsWinner() {
        if (board[1] == computerSymbol && board[2] == computerSymbol && board[3] == ' ') {
            board[3] = computerSymbol;
            return true;
        } else if (board[1] == computerSymbol && board[3] == computerSymbol && board[2] == ' ') {
            board[2] = computerSymbol;
            return true;
        }else if (board[2] == computerSymbol && board[3] == computerSymbol && board[1] == ' ') {
            board[1] = computerSymbol;
            return true;
        } else if (board[4] == computerSymbol && board[5] == computerSymbol && board[6] == ' ') {
            board[6] = computerSymbol;
            return true;
        }else if (board[4] == computerSymbol && board[6] == computerSymbol && board[5] == ' ') {
            board[5] = computerSymbol;
            return true;
        } else if (board[6] == computerSymbol && board[5] == computerSymbol && board[4] == ' ') {
            board[4] = computerSymbol;
            return true;
        } else if (board[7] == computerSymbol && board[8] == computerSymbol && board[9] == ' ') {
            board[9] = computerSymbol;
            return true;
        } else if (board[7] == computerSymbol && board[9] == computerSymbol && board[8] == ' ') {
            board[8] = computerSymbol;
            return true;
        } else if (board[9] == computerSymbol && board[8] == computerSymbol && board[7] == ' ') {
            board[7] = computerSymbol;
            return true;
        } else if (board[1] == computerSymbol && board[4] == computerSymbol && board[7] == ' ') {
            board[7] = computerSymbol;
            return true;
        } else if (board[1] == computerSymbol && board[7] == computerSymbol && board[4] == ' ') {
            board[4] = computerSymbol;
            return true;
        } else if (board[7] == computerSymbol && board[4] == computerSymbol && board[1] == ' ') {
            board[1] = computerSymbol;
            return true;
        } else if (board[2] == computerSymbol && board[5] == computerSymbol && board[8] == ' ') {
            board[8] = computerSymbol;
            return true;
        } else if (board[2] == computerSymbol && board[8] == computerSymbol && board[5] == ' ') {
            board[5] = computerSymbol;
            return true;
        } else if (board[5] == computerSymbol && board[8] == computerSymbol && board[2] == ' ') {
            board[2] = computerSymbol;
            return true;
        } else if (board[3] == computerSymbol && board[6] == computerSymbol && board[9] == ' ') {
            board[9] = computerSymbol;
            return true;
        } else if (board[3] == computerSymbol && board[9] == computerSymbol && board[6] == ' ') {
            board[6] = computerSymbol;
            return true;
        } else if (board[6] == computerSymbol && board[9] == computerSymbol && board[3] == ' ') {
            board[3] = computerSymbol;
            return true;
        } else if (board[1] == computerSymbol && board[5] == computerSymbol && board[9] == ' ') {
            board[9] = computerSymbol;
            return true;
        }else if (board[1] == computerSymbol && board[9] == computerSymbol && board[5] == ' ') {
            board[5] = computerSymbol;
            return true;
        } else if (board[5] == computerSymbol && board[9] == computerSymbol && board[1] == ' ') {
            board[1] = computerSymbol;
            return true;
        } else if (board[3] == computerSymbol && board[5] == computerSymbol && board[7] == ' ') {
            board[7] = computerSymbol;
            return true;
        } else if (board[3] == computerSymbol && board[7] == computerSymbol && board[5] == ' ') {
            board[5] = computerSymbol;
            return true;
        } else if (board[7] == computerSymbol && board[5] == computerSymbol && board[3] == ' ') {
            board[3] = computerSymbol;
            return true;
        }
        return false;
    }


    static void firstToStartGame() {
            int toss = (int) (Math.random() * 10) % 2;
            if (toss == 0) {
                System.out.println("Computer is starts the play first.");
                computerInput();
            } else {
                System.out.println("Player is starting the game.");
                userInput();
            }
        }

    public static void main(String[] args) {
        System.out.println("Welcome To Tic Tac Toe Game");

         createBoard();
         assignSymbol();
         showBoard();
         firstToStartGame();
         //computerAsWinner();
    }

}

