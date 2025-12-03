import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameSummary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameSummary extends Actor
{
    /**
     * Act - do whatever the GameSummary wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   // Add your action code here.
        World world = getWorld();
        if (Greenfoot.mouseClicked(this))
        {
            world.removeObject(this);
        }
    }
}
