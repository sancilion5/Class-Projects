/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card
{
    // instance variables - replace the example below with your own
    private String player;
    private int year;

    /**
     * Constructor for objects of class Card
     */
    
    public Card()
    {
        player = "Derek Jeter";
        year = 2004;
    }
    
    public Card(String playerName, int playerYear)
    {
        // initialise instance variables
        player = playerName;
        year = playerYear;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getPlayer()
    {
        // returns the player's name
        return player;
    }
    
    public int getYear()
    {
        // returns the player's year
        return year;
    }
    
    public void getDetails()
    {
        // returns a card's details
        System.out.println("" + player + " (" + (year) + ")");
    }
    
    public void setDetails(String newPlayer, int newYear)
    {       
        this.player = newPlayer;
        this.year = newYear;
    }
}
