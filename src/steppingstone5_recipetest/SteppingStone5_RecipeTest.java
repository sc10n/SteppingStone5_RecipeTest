package steppingstone5_recipetest;


/**
 *
 * @author Jamie
 */
public class SteppingStone5_RecipeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create two recipe objects first
        SteppingStone5_Recipe myFirstRecipe = new SteppingStone5_Recipe().addNewRecipe();
        SteppingStone5_Recipe mySecondRecipe = new SteppingStone5_Recipe().addNewRecipe();

//        Calls the printRecipe() method from the SteppingStone5_Recipe class that was instantiated above
        myFirstRecipe.printRecipe();

//          Calls the printRecipe() method from the SteppingStone5_Recipe class that was instantiated above
        mySecondRecipe.printRecipe();

    }

}