package ru.mirea.task7;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;
    MovableCircle(int x, int y, int xSeed, int ySeed, int radius){
        center.x=x;
        center.y=y;
        center.xSeed=xSeed;
        center.ySeed=ySeed;
        this.radius=radius;

    }
    public String toString(){
        return "x: "+center.x+"y: "+center.y+"xSeed"+center.xSeed+"xSeed"+ center.ySeed;
    }
    public void moveUp(){
        center.y+=1;
    }
    public void moveDown(){
        center.y-=1;
    }
    public void moveLeft(){
        center.x-=1;
    }
    public void moveRight(){
        center.x+=1;
    }
}
