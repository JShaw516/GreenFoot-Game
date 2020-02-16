import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Three here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Three extends World
{

    /**
     * Constructor for objects of class Three.
     * 
     */
    public Three()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1125, 1125, 1);
    }
 public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new Two());
    }
    }
