package controllers;
import models.Recipe;
import views.CmdLineView;

public class Main {
    static CmdLineView view = new CmdLineView();
    static boolean go = true;

    public static Recipe mainMenu() {

        view.showMainMenu();
        int x = view.getIntInput();

        switch (x) {
            case 1:
                // temporary output statements

                System.out.println(x); // view saved recipes
                break;
            case 2:
                System.out.println(x); // create new recipe
                Recipe newRecipe = new Recipe("null");
                createRecipeMenu(newRecipe);
                return newRecipe;
            case 3:
                System.out.println(x); // exit
                break;
            default:
                break;
        }
        return null;
    }

    public void viewRecipeMenu(int x) {
        view.showRecipeMenu();
        switch (x) {
            case 1:
                System.out.println(x); // view all
                break;
            case 2:
                System.out.println(x); // search
                break;
            default:
                break;
        }
    }

    public void recipeMenu(int x) {
        view.showRecipeOptions();
        switch (x) {
            case 1:
                System.out.println(x); // view
                break;
            case 2:
                System.out.println(x); // edit
                break;
            case 3:
                System.out.println(x); // delete
                break;
            default:
                break;
        }
    }

    public static void createRecipeMenu(Recipe r) {

        int x = 1;

        while(x != 8 && x != 7) {
            view.showCreationMenu();
            x = view.getIntInput();
            switch (x) {
                case 1:
                    System.out.println("Enter a title"); // name
                    r.setName(view.getStringInput());
                    break;
                case 2:
                    // ingredient
                    System.out.println("Enter an ingredient");
                    r.setIngredient(view.getStringInput());
                    break;
                case 3:
                    System.out.println(x); // directions
                    System.out.println("Enter directions");
                    r.setDirections(view.getStringInput());
                    break;
                case 4:
                    System.out.println(x); // time
                    System.out.println("Enter a time");
                    r.setTime(view.getIntInput());
                    break;
                case 5:
                    System.out.println(x); // notes
                    System.out.println("Enter notes");
                    r.setNotes(view.getStringInput());
                    break;
                case 6:
                    System.out.println(x); // view
                    view.showRecipe(r);
                    break;
                case 7:
                    System.out.println(x); // finish
                    break;
                case 8:
                    System.out.println(x); // cancel
                    break;
                default:
                    break;
            }
        } 
    }

    public static void main(String[] args) throws Exception {
        
        while(go == true) {
            mainMenu();
        }
    }
}