import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Rocket extends Actor
{
    private int count;
    private int count2;
    public Rocket()
    {
        this.count=0;
        this.count2=0;
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(100,100);
        setImage(image);
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("a"))
        {
            setRotation(270);
            setLocation(getX()-5,getY());
        }
        else
        {
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setRotation(90);
            setLocation(getX()+5,getY());
        }
        if(!Greenfoot.isKeyDown("a")&&!Greenfoot.isKeyDown("d")&&Greenfoot.isKeyDown("space"))
        {
            if(count==25)
            {
                getWorld().addObject(new bullet(),this.getX(),this.getY()-60);
                count=0;
            }
            count++;
        }
        else
        {
            count=25;
        }
        if(count2==150)
        {
            getWorld().addObject(new Bread(),(int)(Math.random()*(getWorld().getWidth())),25);
            count2=0;
        }
        count2++;
        getWorld().showText(toString(),60,40);
    }    
    public String toString()
    {
        return "Score: "+Ground.score+"\nHealth: "+Ground.health;
    }
}
