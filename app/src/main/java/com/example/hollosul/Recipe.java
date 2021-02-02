package com.example.hollosul;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Recipe extends AppCompatActivity implements View.OnClickListener {
    FragmentManager manager;
    FragmentTransaction ft;

    RecipeOne fragmentOne;
    RecipeTwo fragmentTwo;
    RecipeThree fragmentThree;
    RecipeFour fragmentFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_main);

        manager = getSupportFragmentManager();

        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button four = findViewById(R.id.four);

        fragmentOne = new RecipeOne();
        fragmentTwo = new RecipeTwo();
        fragmentThree = new RecipeThree();
        fragmentFour = new RecipeFour();

        ft = manager.beginTransaction();
        ft.add(R.id.fragment_container, fragmentOne);
        ft.addToBackStack(null);
        ft.commit();

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ft = manager.beginTransaction();

        int id = v.getId();
        switch (id) {
            case R.id.one:
                ft.replace(R.id.fragment_container, fragmentOne);
                ft.commit();
                break;
            case R.id.two:
                ft.replace(R.id.fragment_container, fragmentTwo);
                ft.commit();
                break;
            case R.id.three:
                ft.replace(R.id.fragment_container, fragmentThree);
                ft.commit();
                break;
            case R.id.four:
                ft.replace(R.id.fragment_container, fragmentFour);
                ft.commit();
                break;
        }
    }
}
