/* Melinda Zhao
 * 10-28-24
 * Food3.java
 * This is Food3.java which uses inheritance and methods! 
 * This assignment is submitted late because I was absent on friday (10/25) 
 * 
*/

public class Food3
{
	//Declare protected variables to be used 
    protected String description3;
    protected int pieceCount3;
    protected double pieceCost3;
    protected String itemName3;  // Singular name for the food item

    public Food3(String prepMethod, String ingredient, String name) // Constructor header 
    {
        description3 = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
        itemName3 = name; //set ItemName3
    }

    public Food3(String prepMethod, String ingredient, String name, int numberOfPieces, double costPerPiece) //Allow arguments to pass through and be used 
    {
        description3 = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
        pieceCount3 = numberOfPieces; //Set pieceCount3
        pieceCost3 = costPerPiece; //Set pieceCost3
        itemName3 = name; //Set itemName3
    }

    public void printForSale()  //create void method (because it only prints, no returned value!) 
    {
        double totalRevenue3 = pieceCount3 * pieceCost3;   //calculate revenue 
        String formattedRevenue3 = String.format("%.2f", totalRevenue3); //format string  using format 

        System.out.println(description3 + " will be sold for " + (int)(pieceCost3 * 100) + " cents each. " + //print out necesssary values 
                "With " + pieceCount3 + " " + itemName3 + "(s), $" + formattedRevenue3 + " can be made.");
                
    }
}
