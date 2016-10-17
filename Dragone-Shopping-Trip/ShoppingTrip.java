
/**
 * Write a description of class ShoppingTrip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class ShoppingTrip
{
    //Declaring ArrayList String
    public ArrayList<String> foods;
    
    //Constructor
    public ShoppingTrip()
    {
        //New Foods Array Instance
        foods = new ArrayList();
    }
    
    public int getNumberOfFoods()
    {
        return foods.size();
    }
    
}
