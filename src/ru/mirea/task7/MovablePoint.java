package ru.mirea.task7;

public class MovablePoint implements Movable{
    /*
    package int x;
    package int y;
    package int xSeed;
    package int ySeed;*/

    public int x;
    public int y;
    public int xSeed;
    public int ySeed;
    public MovablePoint(int x, int y, int xSeed, int ySeed) {
        this.x=x;
        this.y=y;
        this.xSeed=xSeed;
        this.ySeed=ySeed;
    }
    public String toString(){
        return "x: "+x+", y: "+y+", xSeed: "+ySeed+", xSeed: "+ySeed;
    }
    public void moveUp(){
        y=y+1;
    }
    public void moveDown(){
        y=y-1;
    }
    public void moveLeft(){
        x=x-1;
    }
    public void moveRight(){
        x=x+1;
    }
}
