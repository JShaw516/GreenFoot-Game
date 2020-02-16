import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Two here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Two extends World
{

    /**
     * Constructor for objects of class Two.
     * 
     */
    public Two()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1125, 1125, 1); 
    }
     public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new One());
    }
}
