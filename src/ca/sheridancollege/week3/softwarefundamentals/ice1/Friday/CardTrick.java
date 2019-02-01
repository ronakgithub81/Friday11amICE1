
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author
 * 
 * 
 * Nikita Fedotov - 991473606
 */
public class CardTrick {
    public static void main(String[] args)
    {
    Card one = new Card();
    one.setSuit("Hearts");
    one.setValue(5);
    System.out.println(one.getSuit() + " " + one.getValue());
    Card two = new Card();
    two.setSuit("Diamonds");
    two.setValue(7);
    }
    
}
