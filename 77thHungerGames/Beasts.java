import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beasts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beasts extends Actor
{
    private final int moveDis = 3;
    private final int turnLimit = 100;
    private final int turnPer = 10;
    private final int newTurn = 10;
    /**
     * Act - do whatever the Beasts wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.getRandomNumber(turnLimit) < turnPer) {
            int smallTurn = Greenfoot.getRandomNumber(newTurn);
            this.turn(smallTurn);
            }
            else {
               this.move(moveDis);
        }
        if (this.isAtEdge()) {
           int degToTurn = Greenfoot.getRandomNumber(180);
           this.turn(degToTurn);
        }
        if (this.getOneIntersectingObject(Character.class) != null) {
            Character myMeal = (Character)this.getOneIntersectingObject(Character.class);
            eat(myMeal);}
        if (this.getOneIntersectingObject(Careers.class) !=null) {
            Careers myMeal = (Careers)this.getOneIntersectingObject(Careers.class);
            eat(myMeal);}
        if (this.getOneIntersectingObject(Tributes.class) !=null) {
            Tributes myMeal = (Tributes)this.getOneIntersectingObject(Character.class);
            eat(myMeal);
        }
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
   private void eat(Tributes meal) {
        World myWrld = (MyWorld)this.getWorld();
        myWrld.removeObject(meal);
}
}
