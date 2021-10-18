package models;

import java.util.ArrayList;

public class Recipe {

    private String name;
    private ArrayList<String> ingredients;
    private String ingredient;
    private String directions;
    private int time; // (00:00) deal with hours and minutes.
    private String notes;
    

    public Recipe(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }


    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }


    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }


    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}