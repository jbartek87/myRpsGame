package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {
    public static String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String result = scanner.nextLine();
            if (result.trim().length() >= 3)
                return result.trim();
            else
                System.out.println("Name should have at least 3 characters.");
        }
    }

    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of rounds: ");
            String result = scanner.nextLine();
            try {
                int rounds = Integer.parseInt(result);
                return rounds;
            } catch (Exception e) {
                System.out.println("Wrong number, try again");
            }
        }
    }

    public static void showStatus(int round, int rounds, int playerScore, int computerScore) {

    }

    public static RpsMove getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your move (P, R, S, X, N): ");
            String result = scanner.nextLine();
            switch (result) {
                case "P":
                    return RpsMove.PAPER;
                case "R":
                    return RpsMove.ROCK;
                case "S":
                    return RpsMove.SCISSORS;
                case "X":
                    return RpsMove.EXIT;
                case "N":
                    return RpsMove.NEWGAME;
                default:
                    System.out.println("Wrong selection, try again ! ");
            }
        }
    }

    public static void showRoundWinner(RpsMove playerMove, RpsMove computerMove, RpsPlayer roundWinner) {
        // dorobić wyświetlanie
    }

    public static void showFinalWinner(int computerScore, int playerScore) {
        //dorobić wyświetlanie
    }
}
