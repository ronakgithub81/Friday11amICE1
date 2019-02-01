
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *@991481378
 * @author Ronak
 */
public class CardTrick {
    public static void main(String[] args)
    {

       Card Frederick =  new Card();
       Frederick.setSuit("Spades");
       Frederick.setValue(10);

       System.out.println(Frederick.getSuit()+Frederick.getValue());
    }
    
}
