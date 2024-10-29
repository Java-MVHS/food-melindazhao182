
/* Melinda Zhao
 * 10-28-24
 * DeepDishPizza3.java
 * This is DeepDishPizza.java which uses inheritance and methods! It extends Pizza3.java, which extended Food3.java. 
 * This assignment is submitted late because I was absent on friday (10/25) 
 * 
  
*/

public class DeepDishPizza3 extends Pizza3 //class header
{
    public DeepDishPizza3(String ingredient) //default constructor! 
    {
        super(ingredient); //use super so the child can use the variable' 
        description3 = "At the sale: deep dish pizza baked with " + ingredient; //Create description 
        itemName3 = "deep dish pizza"; //name the dish 
    }

    public DeepDishPizza3(String ingredient, int numberOfPieces, double costPerPiece) //create constructor that allows values to pass through
    {
        super(ingredient, numberOfPieces, costPerPiece); //use super so the child can access these values
        description3 = "At the sale: deep dish pizza baked with " + ingredient + "\n\n\n" ; //set description and use 3 blank lines!
        itemName3 = "deep dish pizza"; //set the name of the item 
    }
}
