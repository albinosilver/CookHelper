package com.seg2105a.esther.cookhelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Esther on 2016-11-29.
 */

public class ViewRecipeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_view);

        //loads the activity and populates the text view with information from the Recipe object

        playRecipeStep();
        editRecipe();
        deleteRecipe();
    }

    public void playRecipeStep(){
        //goes to the RecipeStep
        FloatingActionButton addButton = (FloatingActionButton) findViewById(R.id.playButton);
        addButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent recipeStep = new Intent(ViewRecipeActivity.this, RecipeStepActivity.class);
                startActivity(recipeStep);
            }
        });
    }

    public void editRecipe(){
        // edits the valuesin the recipe by first going to the recipe forma and changing the values
        FloatingActionButton addButton = (FloatingActionButton) findViewById(R.id.editButton);
        addButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent editRecipe = new Intent(ViewRecipeActivity.this, EditRecipeActivity.class);
                startActivity(editRecipe);
            }
        });
    }

    public void deleteRecipe(){
        // deletes the recipe from the Business Logic as well as the database

        FloatingActionButton addButton = (FloatingActionButton) findViewById(R.id.deleteButton);
        addButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                // delete something
            }
        });
    }
}