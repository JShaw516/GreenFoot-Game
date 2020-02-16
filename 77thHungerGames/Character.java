import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    private final int moveDis = 2;
    private final int turnDeg = 10;
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right")){
            this.move(moveDis);
        }
        if(Greenfoot.isKeyDown("left")) {
            this.move(-moveDis);
        }
        if(Greenfoot.isKeyDown("up")){
           this.turn(turnDeg); 
        }
        if(Greenfoot.isKeyDown("down")){
            this.turn(-turnDeg);
        }
    }
}