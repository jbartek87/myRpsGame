package com.kodilla.rps;

public class RpsGame {
    private String playerName;
    private int rounds;
    private int round = 0;
    private int playerScore = 0;
    private int computerScore = 0;

    public void run() {
        playerName = UserDialogs.getPlayerName();
        rounds = UserDialogs.getNumberOfRounds();
        while (round < rounds) {
            UserDialogs.showStatus(round, rounds, playerScore, computerScore);
            RpsMove playerMove = UserDialogs.getPlayerMove();
            RpsMove computerMove = RpsLogic.getComputerMove();
            RpsPlayer roundWinner = RpsLogic.getWinner(playerMove, computerMove);
            if(roundWinner==RpsPlayer.PLAYER)
                playerScore++;
            else if(roundWinner==RpsPlayer.COMPUTER)
                computerScore++;
            else {
                playerScore++;
                computerScore++;
            }
            UserDialogs.showRoundWinner(playerMove, computerMove,roundWinner);
            round++;
        }
        UserDialogs.showFinalWinner(computerScore,playerScore);

    }
}
