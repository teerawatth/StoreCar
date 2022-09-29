package com.example.storefood1122334455;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bAddFood, bShowImages, bShowFoods2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bAddFood = (Button) findViewById(R.id.bAddFood);
        bAddFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAddCar();
            }
        });


        bShowImages = (Button) findViewById(R.id.bShowFoods);
        bShowImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCars();
            }
        });

    }

    private void showAddCar(){
        Intent intent = new Intent(MainActivity.this, AddCar.class);
        MainActivity.this.startActivity(intent);
    }

    private void showCars(){
        Intent intent = new Intent(MainActivity.this, ShowCars.class);
        MainActivity.this.startActivity(intent);
    }

}