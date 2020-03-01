package com.kodilla.rps;

public class RpsLogic {
    public static RpsMove getComputerMove() {
        //zaimplementować losowanie komputera
        return RpsMove.PAPER;

    }

    public static RpsPlayer getWinner(RpsMove playerMove, RpsMove computerMove) {
        // zaimplementować kto wygrał runde
        return RpsPlayer.PLAYER;
    }
}