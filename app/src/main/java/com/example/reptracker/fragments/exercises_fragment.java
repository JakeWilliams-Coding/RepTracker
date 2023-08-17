package com.example.reptracker.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.reptracker.Abs;
import com.example.reptracker.Back;
import com.example.reptracker.Biceps;
import com.example.reptracker.Cardio;
import com.example.reptracker.Chest;
import com.example.reptracker.Legs;
import com.example.reptracker.R;
import com.example.reptracker.Shoulders;
import com.example.reptracker.Triceps;


public class exercises_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exercises, container, false);

        ImageButton myButtontriceps = view.findViewById(R.id.imageButtontriceps);
        ImageButton myButtonchest = view.findViewById(R.id.imageButtonchest);
        ImageButton myButtonbiceps = view.findViewById(R.id.imageButtonbiceps);
        ImageButton myButtonshoulders = view.findViewById(R.id.imageButtonshoulders);
        ImageButton myButtonlegs = view.findViewById(R.id.imageButtonlegs);
        ImageButton myButtonback = view.findViewById(R.id.imageButtonback);
        ImageButton myButtonabs = view.findViewById(R.id.imageButtonabs);
        ImageButton myButtoncardio = view.findViewById(R.id.imageButtoncardio);




        myButtontriceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Triceps.class);
                startActivity(intent);
            }
        });




        myButtonchest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Chest.class);
                startActivity(intent);
            }
        });



        myButtonbiceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Biceps.class);
                startActivity(intent);
            }
        });



        myButtonshoulders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Shoulders.class);
                startActivity(intent);
            }
        });




        myButtonlegs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Legs.class);
                startActivity(intent);
            }
        });



        myButtonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Back.class);
                startActivity(intent);
            }
        });


        myButtonabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Abs.class);
                startActivity(intent);
            }
        });


        myButtoncardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cardio.class);
                startActivity(intent);
            }
        });


        return view;
    }

}