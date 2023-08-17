package com.example.reptracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.reptracker.fragments.logtracker_fragment;

public class Triceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps);

        ImageButton BackButtonTriceps = findViewById(R.id.backButtontriceps);
        BackButtonTriceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Triceps.this, logtracker_fragment.class);
                startActivity(intent);
            }
        });


    }

}