package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Ronak
 * @author Rajan Grewal 991530913 
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card card = new Card();
       card.setSuit(Card.SUITS[0]);
       card.setValue(7);
        
       System.out.println("Card Suit: " + card.getSuit());
       System.out.println("Card Value: " + card.getValue());  
    }
}
