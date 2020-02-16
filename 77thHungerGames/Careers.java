import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Careers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Careers extends Actor
{
    private final int moveDis = 1;
    private final int turnLimit = 100;
    private final int turnPer = 15;
    private final int newTurn = 10;
    /**
     * Act - do whatever the Careers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            
            
            // tributes == 5
            // level 2 = true
            // makeTributes
            
        if(Greenfoot.getRandomNumber(turnLimit) < turnPer) {
            int smallTurn = Greenfoot.getRandomNumber(newTurn);
            this.turn(smallTurn);
            }
            else {
               this.move(moveDis);
        }
        if (this.isTouching(Cave.class)) {
            int degToTurn = Greenfoot.getRandomNumber(200);
            this.turn(degToTurn);
        }
        if (this.isAtEdge()) {
           int degToTurn = Greenfoot.getRandomNumber(180);
           this.turn(degToTurn);
        }
        
        this.move(moveDis);
        if (this.getOneIntersectingObject(Character.class) != null) {
            Character myMeal = (Character)this.getOneIntersectingObject(Character.class);
            eat(myMeal);}
        if (this.getOneIntersectingObject(Careers.class) !=null) {
            Careers myMeal = (Careers)this.getOneIntersectingObject(Careers.class);
            eat(myMeal);}
}
    private void eat(Character meal) {
    World myWrld = (MyWorld)this.getWorld();
    myWrld.removeObject(meal);
    Greenfoot.playSound("theFallen.wav");
    Greenfoot.setWorld(new GameOver());
}
    private void eat(Careers meal) {
        World myWrld = (MyWorld)this.getWorld();
        myWrld.removeObject(meal);
}
}
