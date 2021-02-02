package com.example.hollosul;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Category extends AppCompatActivity {

    Button food;
    Button friend;
    Button near_friend;
    Button recipe;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
    super.onCreate(saveInstanceState);
    setContentView(R.layout.category);

    food = findViewById(R.id.food);
    friend = findViewById(R.id.friend);
    near_friend = findViewById(R.id.near_friend);
    recipe = findViewById(R.id.recipe);

        final Button login1 = (Button)findViewById(R.id.user);

        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(com.example.hollosul.Category.this, com.example.hollosul.LMainActivity.class);
                startActivity(myintent);

            }
        });

    food.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(com.example.hollosul.Category.this, com.example.hollosul.Food.class);
            startActivity(intent);
        }
    });

    friend.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(com.example.hollosul.Category.this, com.example.hollosul.Friend.class);
            startActivity(intent);
        }
    });

    near_friend.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(com.example.hollosul.Category.this, com.example.hollosul.Near_Friend.class);
            startActivity(intent);
        }
    });

    recipe.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent= new Intent(com.example.hollosul.Category.this, com.example.hollosul.Recipe.class);
            startActivity(intent);
        }
    });
    }
}
