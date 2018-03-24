package steppingstone5_recipetest;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Jamie
 */
public class SteppingStone5_Recipe {

//    Initialize class variables
    private String recipeName;
    private int servings;
    private ArrayList<Ingredient> recipeIngredients = new ArrayList();
    private double totalRecipeCalories;
    
    /**
    * @return the recipeName
    */
    public String getRecipeName() {
        return recipeName;
    }

    /**
     * @param recipeName the recipeName to set
     */
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    
    /**
    * @return the servings
    */
    public int getServings() {
        return servings;
    }

    /**
     * @param servings the servings to set
     */
    public void setServings(int servings) {
        this.servings = servings;
    }
    
        /**
     * @return the recipeIngredients
     */
    public ArrayList<Ingredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    /**
     * @param recipeIngredients the recipeIngredients to set
     */
    public void setRecipeIngredients(ArrayList<Ingredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    /**
     * @return the totalRecipeCalories
     */
    public double getTotalRecipeCalories() {

        return totalRecipeCalories;
    }

    /**
     * @param totalRecipeCalories the totalRecipeCalories to set
     */
    public void setTotalRecipeCalories(double totalRecipeCalories) {
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    
//    Constructor
    public SteppingStone5_Recipe() {
        this.recipeName = "";
        this.servings = 0; //<--- assignment value with appropriate data type
        this.recipeIngredients = new ArrayList<>(); //<-- assignment value for empty ArrayList
        this.totalRecipeCalories = 0.0;
    }
//    Overloaded Constructor
    public SteppingStone5_Recipe(String recipeName, int servings, 
    	ArrayList<Ingredient> recipeIngredients, double totalRecipeCalories) 
    //<-- use appropriate data type for the ArrayList and the servings arguments
    {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    public void addInstructions() {
//        TODO: Add in custom instructions for each recipe.
    }
    
    public void printRecipe() {

//        takes the double totalRecipeCalories casts it to an int, then divides by servings
         int singleServingCalories = ((int)(getTotalRecipeCalories()) / getServings());

         System.out.println("Recipe: " + getRecipeName());
         System.out.println("Serves: " + getServings());
         System.out.println("Ingredients: ");

//         For loop: print each ingredient in the arrayList
         for (int i = 0; i < getRecipeIngredients().size(); i++) {

             Ingredient ingredientList = getRecipeIngredients().get(i);
//             Build a printable list of the ingredients
             String list = ingredientList.nameOfIngredient + "\t" + ingredientList.ingredientAmount +
                     "\t" + ingredientList.unitMeasurement + "\t" + ingredientList.numberCaloriesPerUnit +
                     " Cals \t" + ingredientList.totalCalories + " Total Calories";

             System.out.println(list);
         }

         System.out.println("Each serving has " + singleServingCalories + " Calories for a total of " +
                 (int)getTotalRecipeCalories() + " Calories.");
    }
    
    
    public SteppingStone5_Recipe addNewRecipe() {

//        Instantiate new Ingredient ArrayList
        ArrayList <Ingredient> recipeIngredients = new ArrayList();
//
//        SteppingStone5_Recipe recipe = new SteppingStone5_Recipe();

        int servings = 0;

        Scanner scnr = new Scanner(System.in);

        Ingredient newIngredient = new Ingredient();

        System.out.println("Please enter the recipe name: ");

        setRecipeName(scnr.nextLine());
        
        System.out.println("Please enter the number of servings: ");
        //correct data type & Scanner assignment method for servings variable

        if (scnr.hasNextInt()) {
            servings = scnr.nextInt();

            if (servings >= 1) {
                setServings(servings); // calls setter for servings
                System.out.println("Valid entry - You entered: " + servings);
            } else {
                System.out.println("Please enter a serving size of 1 or greater");
            }

        } else {
            System.out.println("Error: That is not a number. Try again.");
            scnr.next();
        }
        boolean addMoreIngredients = true;
        do {
            System.out.println("Would you like to enter an ingredient? (y or n)");

            String reply = scnr.next().toLowerCase();// Store scanner input to reply, change input to lower case

//            Switch case for entering ingredients
            switch (reply) {
                case "y":
                    recipeIngredients.add(newIngredient.createIngredient());
                    setTotalRecipeCalories(getTotalRecipeCalories() + newIngredient.totalCalories); // keep adding up the calories
                    setRecipeIngredients(recipeIngredients);
                    break;
                case "n":
                    addMoreIngredients = false;
                    break;
                default:
                    System.out.println("Valid answers are 'y' or 'n'"); // prompt if input doesn't equal y or n
                    break;
            }
        } while (addMoreIngredients);

        SteppingStone5_Recipe recipe1 = new SteppingStone5_Recipe(getRecipeName(), getServings(), recipeIngredients,
                getTotalRecipeCalories());
        System.out.println("Recipe for " + getRecipeName() + " saved.");
        
        return recipe1;
    }





}


/**
 * Final Project
 * 
 * For your Final Project:
 * 
 * 1. Modify this code to develop a Recipe class:
 *	a. change the void main method createNewRecipe() that returns a Recipe 
 * 	 
 * 2. FOR FINAL SUBMISSION ONLY:Change the ArrayList type to an 
 *		Ingredient object.  When a user adds an ingredient to the recipe, 
 * 		instead of adding just the ingredient name, you will be adding the 
 *		actual ingredient including name, amount, measurement type, calories.
 *	For the Milestone Two submission, the recipeIngredients ArrayList can
 *	remain as a String type.
 *
 * 3. Adapt the printRecipe() method to print the amount and measurement
 * 	type as well as the ingredient name.
 *
 * 4. Create a custom method in the Recipe class. 
 *      Choose one of the following options:
 *
 * 	a. print out a recipe with amounts adjusted for a different 
 * 		number of servings
 * 
 * 	b. create an additional list or ArrayList that allow users to 
 * 		insert step-by-step recipe instructions
 *
 * 	c. conversion of ingredient amounts from 
 * 		English to metric (or vice versa)
 *
 * 	d. calculate select nutritional information 
 *
 * 	e. calculate recipe cost
 * 
 *      f. propose a suitable alternative to your instructor
 * 
 */ 

