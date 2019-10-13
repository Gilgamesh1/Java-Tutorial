package com.oslot.formas;

public class Main {

    public static void main(String[] args) {
        PlayerPiece playerPiece = new PlayerPiece();
        TilePiece tilePiece = new TilePiece();
        playerPiece.displayShape();
        tilePiece.getAdjancet();
        move(playerPiece);
        move(tilePiece);
        PlayerPiece playerPiece1=new PlayerPiece();
        Object object=playerPiece1;
        GameShape gameShape=playerPiece1;
        Animatable animatable=playerPiece1;
        SpinningLogo spinningLogo=new SpinningLogo();
        spinningLogo.movePiece();
        spinningLogo.animate();
        move(spinningLogo);
    }

    public static void move(GameShape gameShape) {
        gameShape.displayShape();
    }
}
