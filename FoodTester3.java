/* Melinda Zhao
 * 10-28-24
 * FoodTester3.java
 * This is FoodTester3.java which uses inheritance and methods! This will be the tester to test the classes
 * Food3.java, Pizza3.java, and DeepDishPizza3.java! 
 * This assignment is submitted late because I was absent on friday (10/25) 
 * 
*/

public class FoodTester3 //Class header
{ 
    public static void main(String[] args) //main header 
    {
        Food3 food1 = new Food3("baked", "banana", "muffins", 12, 0.50); //create instance and pass through values 
        food1.printForSale(); //print out using the instance just created

        Food3 food2 = new Food3("fried", "yam", "fritters", 3, 1.00); //create instance and pass through values 
        food2.printForSale(); //print out using the instance just created 
 
        Pizza3 pizza = new Pizza3("anchovies", 8, 2.50); //create instance and pass through values 
        pizza.printForSale(); //print out using the instance just created

        DeepDishPizza3 deepDishPizza3 = new DeepDishPizza3("mushrooms", 6, 3.00); //create instance and pass through values 
        deepDishPizza3.printForSale(); //print out using the instance just created
    }
}
