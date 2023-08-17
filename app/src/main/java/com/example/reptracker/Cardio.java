package com.example.reptracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.reptracker.fragments.logtracker_fragment;

public class Cardio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);


        ImageButton BackButtonCardio = findViewById(R.id.backButtoncardio);
        BackButtonCardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cardio.this, logtracker_fragment.class);
                startActivity(intent);
            }
        });



    }

}