import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The arena for the game.
 * 
 * Jalen A. Shaw
 * Version 1 2.7.2020
 */
public class MyWorld extends World
    {
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 1600x1200 cells with a cell size of 1x1 pixels.
        super(1125, 1125, 1);
        //Adds the Cornucopia to the center of the Arena.
        int centerX = this.getWidth()/2;
        int centerY = this.getHeight()/2;
        this.addObject(new Cornucopia(), centerX, centerY);
        
        //The following adds the main character for the game.
        int CharacterX = 1125/2;
        int CharacterY = 770;
        this.addObject(new Character(), CharacterX, CharacterY);
        
        //The following code adds 6 "Careers" into the arena.
        int CareerX = 405;
        int CareerY = 328;
        this.addObject(new Careers(), CareerX, CareerY);
        this.addObject(new Careers(), CareerX+310, CareerY-5);
        this.addObject(new Careers(), CareerX+90, CareerY+430);
        this.addObject(new Careers(), CareerX+290, CareerY+405);
        this.addObject(new Careers(), CareerX+190, CareerY-60);
        
        //The following code add the remaining 17 Tributes to the arena.
        //Also, I cannot add like a normal person so there will only be twenty-three tributes. The Capitol goofed this year.
        int TribX = 660;
        int TribY = 288;
        this.addObject(new Tributes(), TribX, TribY);
        this.addObject(new Tributes(), TribX-200, TribY);
        this.addObject(new Tributes(), TribX-227, TribY+443);
        this.addObject(new Tributes(), TribX-280, TribY+400);
        this.addObject(new Tributes(), TribX-34, TribY+467);
        this.addObject(new Tributes(), TribX+86, TribY+397);
        this.addObject(new Tributes(), TribX-134, TribY-22);
        this.addObject(new Tributes(), TribX+103, TribY+82);
        this.addObject(new Tributes(), TribX+139, TribY+144);
        this.addObject(new Tributes(), TribX+150, TribY+210);
        this.addObject(new Tributes(), TribX+150, TribY+280);
        this.addObject(new Tributes(), TribX+120, TribY+342);
        this.addObject(new Tributes(), TribX-338, TribY+275);
        this.addObject(new Tributes(), TribX-319, TribY+343);
        this.addObject(new Tributes(), TribX-343, TribY+210);
        this.addObject(new Tributes(), TribX-330, TribY+150);
        this.addObject(new Tributes(), TribX-305, TribY+80);
        
        //The following code should add the forest onto the map.
        int ForX = this.getWidth()/2;
        int ForY = 900;
        this.addObject(new Forest(), ForX, ForY);
        
        //The following code should add the lake to the map.
        int LakX = 790;
        int LakY = 990;
        this.addObject(new Lake(), LakX, LakY);
        
        //The following should add the cave to the map.
        int CavX = 125;
        int CavY = 110;
        this.addObject(new Cave(), CavX, CavY);
        
        
        int actorCount = getObjects(Tributes.class).size();
        if(actorCount == 17) {
            int BeastX = 200;
            int BeastY = 200;
            this.addObject(new Beasts(), BeastX, BeastY);
            this.addObject(new Beasts(), BeastX+100, BeastY+100);
        }
    }
}