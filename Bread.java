import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bread extends Actor
{
    int speed; //fast
    int enemyHealth;
    String[]names;
    public Bread()
    {
        this.speed=Ground.level;
        this.enemyHealth=1+Ground.level;
        setRotation(180);
        GreenfootImage image = getImage();  
        image.scale(70,70);
        setImage(image);
    }
    public void setSpeed(int speed)
    {
        this.speed=speed;
    }
    public void act() 
    {
        setLocation(getX(),getY()+speed);
        if(getY()>850)
        {
            getWorld().removeObject(this);
            Ground.health--;
        }
        else if(isTouching(bullet.class))
        {
            Actor actor = getOneIntersectingObject(Actor.class);
            this.enemyHealth--;
            if (actor!=null) {
                getWorld().removeObject(actor);
            }
        }  
        else if(this.enemyHealth==0)
        {
            getWorld().removeObject(this);
            Ground.score++;
        }
        if(Ground.time==900)
        {
            System.out.println("increasing enemy stats");
            Ground.level++;
        }
    }    
}
