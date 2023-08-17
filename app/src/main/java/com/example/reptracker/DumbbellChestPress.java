package com.example.reptracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.reptracker.fragments.exercises_fragment;

public class DumbbellChestPress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbchestpress);


        ImageButton BackButtonCableCross = findViewById(R.id.backButtondbchestpress);
        BackButtonCableCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DumbbellChestPress.this, exercises_fragment.class);
                startActivity(intent);
            }
        });



    }

}