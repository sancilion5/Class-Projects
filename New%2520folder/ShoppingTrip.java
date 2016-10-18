import java.util.ArrayList;
/**
 * Write a description of class ShoppingTrip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShoppingTrip
{
    // instance variables - replace the example below with your own
    private ArrayList<String> foods;

    /**
     * Constructor for objects of class ShoppingTrip
     */
    public ShoppingTrip()
    {
        // initialise instance variables
        foods = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getNumberOfFoods()
    {
        return foods.size();
    }
    
    public void addFood(String foodName)
    {
        foods.add(foodName);
    }
    
    public void removeFood(int index)
    {
        if(index >= 0 && index < foods.size())
        {
            foods.remove(index);
        }
        else
        {
            System.out.println("No food found at index " + index);
        }
    }
    
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
   
   public void listFoodMatching(String searchFood)
   {
    boolean noMatch = true;  
    
    for(String foodName : foods)
    {
        if(foodName.toUpperCase().contains(searchFood))
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