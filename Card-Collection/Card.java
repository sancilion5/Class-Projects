
/**
 * Write a description of class Card here.
 * 
 * @author Anthony Dragone
 * @version 10/24/2016
 */
public class Card
{
    String player;
    int year;

    public Card(int year, String player)
    {
        setDetails(year, player);
    }
    
    public Card()
    {
        setDetails(1997, "Anthony Dragone");
    }

    /**
     * @return Returns the Player's Name
     */
    public String getPlayer()
    {
        return player;
    }

    
    /**
     * @return Returns the year
     */
    public int getYear()
    {
        return year;
    }

    /**
     * @return Returns both the name of the player and the year.
     */
    public String getDetails()
    {
        return player + " (" + year + ")";//Compiles both the player's name and year into a single string variable.
    }

    //Sets the local variables as the global variables.
    public void setDetails(int year, String player)
    {
        this.player = player;
        this.year = year;
    }
}
