/* Melinda Zhao
 * 10-23-24
 * FoodTester.java
 * This is FoodTester.java which works with Food.java. It will  print out all the foods in the main method
 * it is the only one out of the other 3 classes to have a main method!
*/

public class FoodTester //class header
{
    public static void main(String[] args) //main header
    {
        Food food1 = new Food("baked", "banana", "muffins"); //input variables for the constructor 
        food1.printForSale(); //Use the instance to call the print methpd 

        Food food2 = new Food("fried", "yam", "fritters");  //input variables for the constructor 
        food2.printForSale(); //Use the instance to call the print methpd 

        Pizza pizza = new Pizza("pepperoni");  //input variables for the constructor 
        pizza.printForSale();  //Use the instance to call the print methpd 

        DeepDishPizza deepDishPizza = new DeepDishPizza("mushrooms"); //Create a new instance and pass through mushrooms as a string!
        deepDishPizza.printForSale();  //Use the instance to call the print methpd 
    }
}
