import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameComplete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameComplete extends World
{

    /**
     * Constructor for objects of class GameComplete.
     * 
     */
    public GameComplete()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1);
        GameSummary screen = new GameSummary();
        addObject(screen, getWidth()/2, getHeight()/2);
        addObject(new FinalScoreLabel(), getWidth()/2, getHeight()/2);
        Greenfoot.playSound("victoryMusic.mp3");
        addObject(new ReplayButton(), getWidth()/2, 150);
        setPaintOrder(FinalScoreLabel.class, GameSummary.class, ReplayButton.class);
    }
    
}
