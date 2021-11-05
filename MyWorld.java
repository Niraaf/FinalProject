import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 900, 1);
        addObject(new Ground(),300,990);
        addObject(new Rocket(),300,840);
    }
}
