package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Ronak
 * @author Rajan Grewal 991530913 
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card card1 = new Card();
       card1.setSuit(Card.SUITS[0]);
       card1.setValue(6);
        
       System.out.println("Card Suit: " + card1.getSuit());
       System.out.println("Card Value: " + card1.getValue());  
       
       System.out.println();
       
       Card card2 = new Card();
       card2.setSuit(Card.SUITS[3]);
       card2.setValue(9);
        
       System.out.println("Card Suit: " + card2.getSuit());
       System.out.println("Card Value: " + card2.getValue());  
    }
}
