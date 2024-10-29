/* Melinda Zhao
 * 10-23-24
 * Pizza.java
 * This is Pizza.java which works with Food.java and is a subclass! 
 * This class EXTENDS Food 
   
*/
 
public class Pizza extends Food //c;ass header
{
    public Pizza(String ingredient) //constructor header, with one argument (string) passed through!
    {
        super("baked", ingredient, "pizza"); //use supper so the child (Pizza) can access the parent (Food)'s variables
    }
}
