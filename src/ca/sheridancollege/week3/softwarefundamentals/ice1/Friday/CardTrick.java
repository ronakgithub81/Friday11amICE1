
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Tavin
 * @ID 991500992
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card c1 = new Card();
       c1.setSuit("hearts");
       c1.setValue(1);
       
       System.out.println("Suit: " + c1.getSuit() + " Value: "+ c1.getValue());
    }
    
}
