
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
    
    //Returns the number of food
    public int getNumberOfFoods()
    {
        return foods.size();
    }
    
    //Adds food to Array
    public void addFood(String foodName)
    {
        foods.add(foodName);
    }
    
    //Removes food from Array
    public void removeFood(int index)
    {
        if(index >= 0 & index < foods.size())
        {
            foods.remove(index);
        }
        else
        {
            System.out.println("NO food found at index " + index);
        }
    }
    
    //Lists food
    public String listFood(int index)
    {
        if(index >= 0 & 
