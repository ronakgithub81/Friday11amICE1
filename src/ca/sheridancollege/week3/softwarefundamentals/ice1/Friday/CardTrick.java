
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Chelsea Penner
 * Student Number: 991350908
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card myCard = new Card();
       myCard.setSuit("Diamonds");
       myCard.setValue(13);
        
       System.out.print("My card is the " + myCard.getValue() + "of " + myCard.getSuit() + "!");
    }
    
}
