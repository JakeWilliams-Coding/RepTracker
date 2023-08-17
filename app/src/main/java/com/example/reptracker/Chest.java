package com.example.reptracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.reptracker.fragments.logtracker_fragment;

public class Chest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);



        ImageButton BackButtonChest = findViewById(R.id.backButtonchest);
        BackButtonChest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chest.this, logtracker_fragment.class);
                startActivity(intent);
            }
        });


        Button CableCrossButton = findViewById(R.id.buttoncablecross);
        CableCrossButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chest.this, CableCrossovers.class);
                startActivity(intent);
            }
        });

        Button DumbbellFliesButton = findViewById(R.id.buttondbflies);
        DumbbellFliesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chest.this, DumbbellFlies.class);
                startActivity(intent);
            }
        });

        Button IncDumbellPressButton = findViewById(R.id.buttoninclinedbpress);
        IncDumbellPressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chest.this, IncDumbbellPress.class);
                startActivity(intent);
            }
        });

        Button IncBenchPressButton = findViewById(R.id.buttoninclinebenchpress);
        IncBenchPressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chest.this, InclineBenchPress.class);
                startActivity(intent);
            }
        });

        Button DumbbelChestPressButton = findViewById(R.id.buttondbchestpress);
        CableCrossButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chest.this, DumbbellChestPress.class);
                startActivity(intent);
            }
        });

        Button BenchPressButton = findViewById(R.id.buttonbenchpress);
        BenchPressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chest.this, BenchPress.class);
                startActivity(intent);
            }
        });



    }

}