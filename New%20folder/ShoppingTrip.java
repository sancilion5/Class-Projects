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
   
   public int listFoodMatching(String searchFood)
   {
       int index = 0;
       boolean noMatch = true;
       
       while(noMatch && index < foods.size())
       {
           if(foodname.contains(searchFood))
           {
               noMatch = false;
           }
           else
           {
               index++;
           }
       }
       if(noMatch)
       {
           return -1;
       }
       else
       {
           return index;
       }
   }
    
    
}
