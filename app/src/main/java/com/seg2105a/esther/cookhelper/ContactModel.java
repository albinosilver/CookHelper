package com.seg2105a.esther.cookhelper;

/**
 * Created by Esther on 2016-12-02.
 */

public class ContactModel {
    private String ID;
    private String title;
    private String description;
    private Double cookingTime;
    private String image;
    private String[] recipeStep;
    private String[] category;
    private String[] type;

    public String getID() {
        return ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(Double cookingTime) {
        this.cookingTime = cookingTime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String[] getRecipeStep() {
        return recipeStep;
    }

    public void setRecipeStep(String[] recipeStep) {
        this.recipeStep = recipeStep;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public void setID(String ID) {

        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}