
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
        foods = new ArrayList<String>();        
    }
    
    public void QuickList()
    {
        foods.add("Shrimp Scampi");
        foods.add("Popcorn Shrimp");
        foods.add("Chicken");
        foods.add("Chicken and Shrimp Lo Mein");
        foods.add("Shrimp Tempura");
        foods.add("Chicken Tempura");
        foods.add("Chicken Nuggets");
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
    public void listFood(int index)
    {
        if(index >=0 && index < foods.size())
        {
            String foodname = foods.get(index);
            System.out.println(foodname);
        }
        else
        {
            System.out.println("No food found at index " + index);
        }
    }
    
    //List all food in the array
    public void listAllFoods()
    {
        if(foods.size() <= 0)
        {
            System.out.println("No food items to list.");
        }
        else
        {
           for(String foodName : foods)
           {
               System.out.println(foodName);
           }
        }
    }

    //list Foods with matching name
    public void listFoodMatching(String searchFood)
   {
    boolean noMatch = true;  
    for(String foodName : foods)
    {
        if(foodName.toUpperCase().contains(searchFood.toUpperCase()))
        {
            System.out.println("Food: " + foodName);
            noMatch = false;
        }
    }
    if(noMatch)
    {
         System.out.println("No foods match the parameter.");
    }
   }
}