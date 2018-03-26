package steppingstone5_recipetest;


/**
 *
 * @author Jamie Thompson
 * Recipe Test class for checking recipe and ingredient class functionality
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


/*
 * Reflection:
 *
 * I think I underestimated this weeks project. I set off on using the stepping stone code to just create recipes and
 * ingredients using the overloaded constructors. Which worked but I was struggling with the fact of having manual
 * input as the instructions suggested. After getting some answers to my questions on the discussion board I decided to
 * focus on adapting this weeks lab into usable code for the final project coming up. I tossed out all the stepping stone
 * 5 code that created the recipes and ingredients automatically and added in my ingredient class from last week's
 * assignment. I added in all the requirements to the Recipe class such as the accessors and mutators, the printRecipe
 * method and the addNewRecipe method. I removed the main() method from the Recipe class as suggested for the final project and moved the main() into the RecipeTest
 * class. In the RecipeTest class I instantiated two Recipe objects like the instructions said to using the addNewRecipe()
 * methods all in one swoop. From there I called printRecipe() method from the Recipe class for each recipe object. Inside
 * each addNewRecipe() method would call the createIngredient() method from the Ingredient class and store those values
 * in the arrayList. While its more simple than the SteppingStone 5 code, I feel as though this still meets the intent
 * of the Lab guidelines. During this lab I noticed that writing was easier this week as I could write more code without
 * referencing a previous example or looking at the documentation. I think this can be attributed to that fact that I have
 * been writting and working with these same patterns for the past weeks so they are becoming more muscle memory at this
 * point.
 *
 */