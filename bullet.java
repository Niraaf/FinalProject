import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class bullet extends Actor
{
    public bullet()
    {
        setRotation(270);
    }
    public void act() 
    {
        move(5);
        if(getY()<1)
        {
            getWorld().removeObject(this);
        }
    }
}
