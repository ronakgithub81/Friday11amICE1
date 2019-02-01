
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 * Student NO: 991533120
 * @author Ryan Hill
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card ryanHill = new Card();
       ryanHill.setSuit("Hearts");
       ryanHill.setValue(1);
        
       System.out.println("Ryan Hill Card Suit: " + ryanHill.getSuit() +
                          "\nRyan Hill Card Value: " + ryanHill.getValue())
    }
    
}
