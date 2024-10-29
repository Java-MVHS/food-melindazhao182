/* Melinda Zhao
 * 10-23-24
 * Pizza3.java
 * This is Pizza3.java which uses inheritance and methods!
 * This assignment is submitted late because I was absent on friday (10/25) 
 * 
  
*/


public class Pizza3 extends Food3 //class header that extends Food3
{
    public Pizza3(String ingredient) //create constructor! 
    {
        super("baked", ingredient, "pizza"); //use super so Pizza3 can access Food3's variables (since Food3 is the PARENT of Pizza3) 
    }

    public Pizza3(String ingredient, int numberOfPieces, double costPerPiece) //allow arguments to pass through so the child class (Pizza3) can use them! 
    {
        super("baked", ingredient, "pizza", numberOfPieces, costPerPiece); //Use super so the child can access the parent class methods and variables
    }
}
