package com.example.mauryafood;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mauryafood.Models.Food_model;

import java.util.ArrayList;

import Adapters.Food_Ad;

public class FoodActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_food);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //for toolbar
        Toolbar toolbar=findViewById(R.id.tool);
        setSupportActionBar(toolbar);

        // recycler_view
        recyclerView=findViewById(R.id.recy);

        ArrayList<Food_model> list=new ArrayList<>();
        list.add(new Food_model(R.drawable.food2,"$20"));
        list.add(new Food_model(R.drawable.food8,"$10"));
        list.add(new Food_model(R.drawable.food4,"$8 (veg)"));
        list.add(new Food_model(R.drawable.food5,"$5"));
        list.add(new Food_model(R.drawable.food6,"$7"));
        list.add(new Food_model(R.drawable.food2,"$12"));
        list.add(new Food_model(R.drawable.food8,"$18"));
        list.add(new Food_model(R.drawable.food9,"$14"));
        list.add(new Food_model(R.drawable.food2,"$9"));
        list.add(new Food_model(R.drawable.food4,"$4"));
        list.add(new Food_model(R.drawable.food5,"$7"));
        list.add(new Food_model(R.drawable.food8,"$8"));

        Food_Ad foodAd=new Food_Ad(list,this);
        recyclerView.setAdapter(foodAd);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


    }

// inflating the menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.pro){
            Toast.makeText(FoodActivity.this,"coming soon",Toast.LENGTH_SHORT).show();
        }else if(item.getItemId()==R.id.ab){
            Toast.makeText(FoodActivity.this,"Coming soon",Toast.LENGTH_SHORT).show();
        }else{

        }
        return true;
    }

}