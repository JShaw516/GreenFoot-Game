import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tributes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tributes extends Actor
{
    private final int moveDis = 1;
    private final int turnLimit = 179;
    private final int turnPer = 15;
    private final int newTurn = 10;
    /**
     * Act - do whatever the Tributes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(this.isAtEdge()) {
            int degToTurn = Greenfoot.getRandomNumber(200);
            this.turn(degToTurn);}
        if(this.isTouching(Lake.class)) {
            int degToTurn = Greenfoot.getRandomNumber(200);
            this.turn(degToTurn);}
        if(this.isTouching(Cave.class)) {
            int degToTurn = Greenfoot.getRandomNumber(200);
            this.turn(degToTurn);}
        if(Greenfoot.getRandomNumber(turnLimit) < turnPer) {
            int smallTurn = Greenfoot.getRandomNumber(newTurn);
            this.turn(smallTurn);
            }
            else {
               this.move(moveDis);
        }
        
        this.move(moveDis);
        if(this.getOneIntersectingObject(Character.class) !=null) {
            Character myMeal = (Character)this.getOneIntersectingObject(Character.class);
            eat(myMeal);
        }
        if(this.getOneIntersectingObject(Tributes.class) !=null) {
            Tributes myMeal = (Tributes)this.getOneIntersectingObject(Tributes.class);
            eat(myMeal);
        }
}
    private void eat(Character meal){
        World myWrld = (MyWorld)this.getWorld();
        myWrld.removeObject(meal);
        Greenfoot.playSound("theFallen.wav");
        Greenfoot.setWorld(new GameOver());
    }
    private void eat(Tributes meal){
        World myWrld = (MyWorld)this.getWorld();
        myWrld.removeObject(meal);
    }
}
