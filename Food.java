/* Melinda Zhao
 * 10-23-24
 * Food.java
 * This is Food.java which uses inheritance and methods! 
 * This assignment is submitted late because I was absent on friday (10/25) 
 * 
*/

public class Food //class header
{
    protected String str; //declare a protected string to be used 

    public Food() //create a default constructor
    {
        str = ""; //set string to be blank 
    }

    public Food(String prepMethod, String ingredient, String name) //create a constructor that can be used with different types of foods!
    {
        str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
    }

    public void printForSale() //print out the string so the user can see, this will be called from FoodTester.java! 
    {
        System.out.println(str); //use println to print out the sale, prepmethod, and ingredients 
       
    }
}



