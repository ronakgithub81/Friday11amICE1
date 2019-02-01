
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Ronak
 *
 * Student ID: 991480365
 *
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card H9 = new Card();
       Card D5 = new Card();

       H9.setSuit("Hearts");
       H9.setValue(9);

       D5.setSuit("Diamonds");
       D5.setValue(5);

       System.out.println(H9.getSuit() + " " + H9.getValue());
    }
    
}
