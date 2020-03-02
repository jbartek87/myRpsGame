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
        System.out.println("Round number: " + round + "\n" + "Player score: " + playerScore + "\n" +
                "Computer score: " + computerScore);
    }

    public static RpsMove getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your move: \n P - paper \n R - rock \n S - scissors  " +
                    "\n X - exit \n N -new game ");
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
        roundWinner = RpsLogic.getWinner( playerMove, computerMove );
        System.out.println("Round winner is " + roundWinner);
    }

    public static void showFinalWinner(int computerScore, int playerScore) {
        System.out.println("Computer has scored: " + computerScore );
        System.out.println("Player has scored " + playerScore);
        if(computerScore>playerScore){
            System.out.println("Computer has won the game");
        } else if(playerScore>computerScore){
            System.out.println("Human player has won the game");
        } else System.out.println("We have a draw");
    }
}
