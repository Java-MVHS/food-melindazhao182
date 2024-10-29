/* Melinda Zhao
 * 10-28-24
 * DeepDishPizza.java
 * This is DeepDishPizza.java which works with Pizza.java and extends Pizza.java and is a subclass! 
 * It EXTENDS Pizza.java, which extends Food.java
   
*/
public class DeepDishPizza extends Pizza //class header
{
    public DeepDishPizza(String ingredient) //header for constructor 
    {
        super(ingredient); //use super to call from the parent class  
        str = "At the sale: deep dish pizza baked with " + ingredient; //Create a string for the deep dish pizza
    }
}
