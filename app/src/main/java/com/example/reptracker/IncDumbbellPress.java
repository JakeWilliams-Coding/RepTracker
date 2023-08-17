package com.example.reptracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.reptracker.fragments.exercises_fragment;

public class IncDumbbellPress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incdbpress);


        ImageButton BackButtonCableCross = findViewById(R.id.backButtonincdbpress);
        BackButtonCableCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IncDumbbellPress.this, exercises_fragment.class);
                startActivity(intent);
            }
        });



    }

}
