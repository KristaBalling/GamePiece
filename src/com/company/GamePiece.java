package com.company;

public class GamePiece {

    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;

    public GamePiece(){
        // Assign values to the new instance fields
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void move(int positionX, int Y) {
        if (frozen == true) {
            System.out.println("You are frozen");
        } else {
            this.positionX = positionX;
            positionY = Y;
        }
    }
//
//    Add a freeze() method (returns void) and set frozen to true
    public void freeze() {
        this.frozen = true;
    }

//    Add a unfreeze() method (returns void) and set frozen to false
    public void unfreeze() {
        this.frozen = false;
    }

}
