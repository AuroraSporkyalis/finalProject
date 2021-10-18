package views;
import java.util.Scanner;
import models.Recipe;

public class CmdLineView {

    public int getIntInput() {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        return x;
    }

// output first menu, want to see saved recipes or make a new one?
    public void showMainMenu() {
        System.out.println("1. View saved recipes\n2. Create new recipe.\n3. Exit");
        /*
        View saved recipes
        Create new recipe
        Exit
        */
    }

// output list of saved recipes I guess
    public void showRecipeMenu() {
        System.out.println("1. View all recipes\n2. Search recipes");
        /*
        View all recipes as a menu
        Search recipes
        */
    }


// edit or delete a recipe
    public void showRecipeOptions() {
        System.out.println("1. View\n2. Edit\n3. Delete");
        /*
        View recipe
        Edit recipe
        Delete recipe
        */
    }


// main recipe creation menu
    public void showCreationMenu(){
        System.out.println("1. add or edit title.");
        System.out.println("2. add or edit ingredients.");
        System.out.println("3. add or edit directions.");
        System.out.println("4. add or edit time.");
        System.out.println("5. add or edit notes.");
        System.out.println("6. view recipe.");
        System.out.println("7. finish and save.");
        System.out.println("8. cancel and exit.");
    /*
    (1) add or edit title
    (2) add ingredient
    (3) add directions
    (4) add time
    (5) add notes
    (6) view recipe
    (7) finish and save
    */ 
    }

    public void showRecipe(Recipe r) {
        System.out.println("-----------------------");
        System.out.println("Title: " + r.getName());
        System.out.println("-----------------------");
        System.out.println("Time: " + r.getTime());
        System.out.println("Ingredient: " + r.getIngredient());
        System.out.println("Directions: " + r.getDirections());
        System.out.println("Notes: " + r.getNotes());
        // print out title, time, ingredients, directions, notes
    }

    public String getStringInput() {
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        return x;
    }
}