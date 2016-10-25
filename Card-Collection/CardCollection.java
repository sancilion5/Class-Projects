import java.util.ArrayList;
/**
 * Write a description of class CardCollection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardCollection
{
    // instance variables - replace the example below with your own
    private String name;
    private ArrayList<Card> cards;

    /**
     * Constructor for objects of class CardCollection
     */
    public CardCollection(String collectorName)
    {
        // initialise instance variables
        name = collectorName;
        cards = new ArrayList<>();
    }
    
    public CardCollection()
    {
        new Card("Cole Hamels", 2001);
        new Card("Bob Coles", 1968);
        new Card("Yogi Berra", 1959);
        new Card("Alex Rodriguez", 2004);
        new Card("Rodney Corew", 1975);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getNumberOfCards()
    {
        // put your code here
        return cards.size();
    }
    
    public void indexValid(int index)
    {
        boolean inIndex = true;
        
        if(index < 0)
        {
            System.out.println("Index cannot be negative: " +index);
        }
        else if(index > cards.size())
        {
            System.out.println("Index is too large: " +index);
        }
    }
    
    public void addCard(Card card)
    {
        if(card != null)
        {
            cards.add(card);
            card.getDetails();
        }
        else
        {
            System.out.println("Invalid card can not be added.");
        }
    }
    
    public void removeCard(int index)
    {
        if(index >= 0 && index < cards.size())
        {
            cards.remove(index);
        }
        else
        {
            System.out.println("NO card to remove at index " + index);
        }
    }
    
    public void listCard(int index)
    {
        if(index >= 0 && index < cards.size())
        {
            Card cardname = cards.get(index);
            System.out.println(cardname);
        }
        else
        {
            System.out.println("Invalid index: "+index);
        }
    }
    
    public void listAllCards()
    {
        if (cards.size() >= 0)
        {
            for(Card cardName : cards)
            {
                System.out.println("Card listing:");
                System.out.println(cardName);
            }
        }
        else
        {
            System.out.println("There are NO cards to print.");
        }
    }
    
    public void listByPlayer(String searchPlayer)
    {
        boolean noMatch = true;
        
        for(Card card : cards)
        {
            if(card.getPlayer().toUpperCase().contains(searchPlayer))
            {
                System.out.println("Card listings:");
                System.out.println("Player: " + card.getPlayer());
                noMatch = false;
            }
        }
        if(noMatch)
        {
            System.out.println("No cards found for player: "+searchPlayer);
        }
    }
    
    public void listByYear(int searchYear)
    {
        boolean noMatch = true;
        
        for(Card card : cards)
        {
            if(card.getYear() == (searchYear))
            {
                System.out.println("Card listings:");
                System.out.println("Year: " + card.getYear());
                noMatch = false;
            }
        }
        if(noMatch)
        {
            System.out.println("No cards found for year: "+searchYear);
        }
    }
    
    public void findFirstOfPlayer(String searchString, int index)
    {
        index = 0;
        boolean searching = true;
        
        while(searching = true && index < cards.size())
        {
           if(cards.get(index).getPlayer().toUpperCase().contains(searchString))
           {
               searching = false;
           }
           else
           {
               index++;
           }
        }
        if(searching = true)
        {
            System.out.println("NO player card for: " +searchString);
        }
        else
        {
            System.out.println("Player card for: " +searchString+ " at index: "+index);
        }
        {
            System.out.println("Player matching your input was found at index number " +index);
            index++;
        }
    }
}
