
/**
 * Write a description of class CardCollection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class CardCollection
{
    String collectorName;
    public ArrayList<Card> cards;
    
    public CardCollection(String collectorName)
    {
        this.collectorName = collectorName;
        cards = new ArrayList<Card>();
    }
    
    /**
     * @return Returns the number of cards in the collection.
     */
    public int getNumberOfCards()
    {
        return cards.size();
    }
    
    //Checks to see if the card index is valid
    public boolean indexValid(int index)
    {
        boolean validity = true;
        if(index <= 0)
        {
            System.out.println("Index cannot be negative: " + index);
            validity = false;
        }
        else if(index > cards.size())
        {
            System.out.println("Index is too large: " + index);
            validity = false;
        }
        return validity;
    }
    
    //Adds Cards
    public void addCard(Card card)
    {
        if(card != null)
        {
            cards.add(card);
            System.out.println("Added card: " + card.getDetails());
        }
        else
        {
            System.out.println("Invalid card can not be added");
        }
    }
    
    //Removes Cards
    public void removeCard(int index)
    {
        if(indexValid(index))
        {
            cards.remove(index);
        }
        else
        {
            System.out.println("No card to remove at index: " + index);
        }
    }
    
    //list the indicated card
    public void listCard(int index)
    {
        if(indexValid(index))
        {
            System.out.println("Card " + index + ": " + cards.get(index).getDetails());
        }
        else
        {
            System.out.println("Invalid index: " + index);
        }
    }
    
    //lists all cards in the collection
    public void listAllCards()
    {
        if(cards.size() > 0)
        {
            for(Card card : cards)
            {
                System.out.println(card.getDetails());
            }
        }
        else
        {
            System.out.println("There are NO cards to print");
        }
    }
    
    //Searches through cards for cards with a specific player
    public void listByPlayer(String player)
    {
        boolean found = false;
        for(Card card : cards)
        {
            if(card.getPlayer().toLowerCase().trim().contains(player.toLowerCase().trim()))
            {
                System.out.println(card.getDetails());
                found = true;
            }
        }
        if(found != true)
        {
            System.out.println("NO cards found for player: " + player);
        }
    }
    
    //looks through cards for cards with a specific year
    public void listByYear(int year)
    {
        boolean found = false;
        for(Card card : cards)
        {
            if(card.getYear() == year)
            {
                System.out.println(card.getDetails());
                found = true;
            }
        }
        if(found != true)
        {
            System.out.println("NO cards found for year: " + year);
        }
    }
    
    public void findFirstOfPlayer(String searchString)
    {
        int index = 0;
        boolean searching = true;
        for(searching = true; index < cards.size();)
        {
        }
    }
}
