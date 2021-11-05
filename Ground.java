import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Ground extends Actor
{   
    public static int health;
    public static int score;
    public static int time=0;
    public static int level=1;
    public Ground()
    {
        this.health=10;
        this.score=0;
    }
    public void act() 
    {
        time++;
    }    
}
