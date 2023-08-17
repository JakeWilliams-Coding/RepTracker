package com.example.reptracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.reptracker.fragments.exercises_fragment;
import com.example.reptracker.fragments.logtracker_fragment;

public class CableCrossovers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cablecrossovers);


        ImageButton BackButtonCableCross = findViewById(R.id.backButtoncablecross);
        BackButtonCableCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CableCrossovers.this, exercises_fragment.class);
                startActivity(intent);
            }
        });



    }

}