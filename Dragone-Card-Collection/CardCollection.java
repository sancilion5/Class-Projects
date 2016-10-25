
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
        boolean validity;
        validity = true;
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
    
    public void listByPlayer(String player)
    {
        boolean found;
        found = false;
    }
}
