package com.company;

public class Main {

    public static void main(String[] args) {


        // Class constructor function
        GamePiece bigFoot = new GamePiece();
        bigFoot.move(5, 8);
        bigFoot.freeze();
        bigFoot.move(7,2);
        bigFoot.unfreeze();
        bigFoot.move(7,2);



}
}
