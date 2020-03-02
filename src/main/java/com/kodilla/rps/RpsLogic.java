package com.kodilla.rps;

import java.util.Random;

public class RpsLogic {
    public static RpsMove getComputerMove() {
        //zaimplementować losowanie komputera
        Random random = new Random();
        int numberDrawn = random.nextInt( 3 );
        if (numberDrawn == 0) {
            System.out.println( "Computer has chosen PAPER" );
            return RpsMove.PAPER;
        } else if (numberDrawn == 1) {
            System.out.println( "Computer has chosen ROCK" );
            return RpsMove.ROCK;
        } else {
            System.out.println( "Computer has chosen SCISSORS" );
            return RpsMove.SCISSORS;
        }
    }

    public static RpsPlayer getWinner(RpsMove playerMove, RpsMove computerMove) {
        if (playerMove == RpsMove.ROCK && computerMove == RpsMove.SCISSORS) {
            return RpsPlayer.PLAYER;
        } else if (playerMove == RpsMove.PAPER && computerMove == RpsMove.ROCK) {
            return RpsPlayer.PLAYER;
        } else if (playerMove == RpsMove.SCISSORS && computerMove == RpsMove.PAPER) {
            return RpsPlayer.PLAYER;
        } else if (playerMove == computerMove) {
            return RpsPlayer.BOTH;
        } else {
            return RpsPlayer.COMPUTER;
        }

    }


}