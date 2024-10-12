package com.example.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.models.Dish;
import com.example.models.DishAdapter;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = getIntent();

        String cat = intent.getStringExtra("selectedCat");

        Toast.makeText(MenuActivity.this, cat, Toast.LENGTH_SHORT).show();


        ListView listView = findViewById(R.id.listView);

        List<Dish> dishes = new ArrayList<>();

        String[] items = {"Orientale","Marocaine","Asiatique","Espagnole"};


        dishes.add(new Dish("Couscous", "A classic morracan pasta dish", "$50","Marocaine"));
        dishes.add(new Dish("Tajine", "A classic morracan pasta dish", "$45","Marocaine"));
        dishes.add(new Dish("Reffissa", "A classic morracan pasta dish", "$60","Marocaine"));
        dishes.add(new Dish("Spaghetti Bolognese", "A classic Italian pasta dish", "$40","Espagnole"));
        dishes.add(new Dish("Caesar Salad", "Fresh lettuce, croutons, and Caesar dressing", "$30","Espagnole"));
        dishes.add(new Dish("Margherita Pizza", "Tomato, mozzarella, and basil", "$20","Asiatique"));
        dishes.add(new Dish("Tiramisu", "Italian dessert made of coffee-soaked ladyfingers", "$6.50","Orientale"));
        dishes.add(new Dish("Briouate", "Savory Moroccan pastry filled with meat", "$20", "Marocaine"));
        dishes.add(new Dish("Gaspacho", "Cold Spanish soup made from tomatoes", "$10", "Espagnole"));
        dishes.add(new Dish("Pad Thai", "Stir-fried rice noodle dish from Thailand", "$15", "Asiatique"));
        dishes.add(new Dish("Spring Rolls", "Crispy rolls filled with vegetables", "$8", "Orientale"));
        dishes.add(new Dish("Pisto", "Spanish ratatouille made with vegetables", "$12", "Espagnole"));
        dishes.add(new Dish("Banh Mi", "Vietnamese sandwich with meat and pickled vegetables", "$9", "Asiatique"));
        dishes.add(new Dish("Baklava", "Sweet pastry filled with nuts and honey", "$5", "Orientale"));

        List<Dish> filteredList = new ArrayList<>();
        for(Dish dish : dishes)
            if(dish.getCatgorie().equalsIgnoreCase(cat))
                filteredList.add(dish);
        DishAdapter adapter = new DishAdapter(this, filteredList);

        // Step 4: Set the adapter to the ListView
        listView.setAdapter(adapter);
    }
}