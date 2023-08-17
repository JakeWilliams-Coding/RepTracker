package com.example.reptracker.fragments;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.text.InputType;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.reptracker.R;


public class logtracker_fragment extends Fragment {


    private Button addButton;
    private Button deleteButton;

    private static final int NOTIFICATION_ID = 1;
    private Handler handler = new Handler();
    private boolean isPaused = false;
    private long startTime = 0; // Number for when app is paused, start timer from 0

    private Runnable notificationRunnable = new Runnable() {
        @Override
        public void run() {
            if (isPaused && System.currentTimeMillis() - startTime >= 60000) {
                //This sends notification only if app is paused for more than 60 seconds
                sendNotification();
            }
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_logtracker, container, false);

        Button deleteButton = view.findViewById(R.id.buttonDelete);
        addButton = view.findViewById(R.id.buttonadd);



        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addHorizontalLayout();
            }
        });



        deleteButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            LinearLayout verticalLayout = getView().findViewById(R.id.LinearLayout11);
            verticalLayout.removeAllViews();
        }
    });

    return view;
}



    private void addHorizontalLayout() {

        LinearLayout horizontalLayout = new LinearLayout(getContext());
        horizontalLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        horizontalLayout.setOrientation(LinearLayout.HORIZONTAL);


        EditText editTextExercise = new EditText(getContext());
        editTextExercise.setLayoutParams(new LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                1));
        editTextExercise.setPadding(10, 10, 10, 10);
        editTextExercise.setTextSize(23);
        editTextExercise.setTypeface(null, Typeface.BOLD);
        editTextExercise.setGravity(Gravity.CENTER);
        editTextExercise.setHint("Enter Exercise");




        EditText editTextWeight = new EditText(getContext());
        editTextWeight.setLayoutParams(new LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                1));
        editTextWeight.setGravity(Gravity.CENTER);
        editTextWeight.setHint("Weight");
        editTextWeight.setInputType(InputType.TYPE_CLASS_NUMBER);
        editTextWeight.setMinHeight(48);
        editTextWeight.setPadding(10, 10, 10, 10);




        EditText editTextReps = new EditText(getContext());
        editTextReps.setLayoutParams(new LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                1));
        editTextReps.setGravity(Gravity.CENTER);
        editTextReps.setHint("Reps");
        editTextReps.setInputType(InputType.TYPE_CLASS_NUMBER);
        editTextReps.setMinHeight(48);
        editTextReps.setPadding(10, 10, 10, 10);

        // Add the TextView and EditTexts to the new LinearLayout
        horizontalLayout.addView(editTextExercise);
        horizontalLayout.addView(editTextWeight);
        horizontalLayout.addView(editTextReps);

        // Add the new LinearLayout to the existing vertical layout
        LinearLayout verticalLayout = getView().findViewById(R.id.LinearLayout11);

        verticalLayout.addView(horizontalLayout);
    }




    //Notifications

    @Override
    public void onPause() {
        super.onPause();
        isPaused = true;
        startTime = System.currentTimeMillis(); // Starts when app is onResume
        handler.postDelayed(notificationRunnable, 60000);
    }

    @Override
    public void onResume() {
        super.onResume();
        isPaused = false;
        handler.removeCallbacks(notificationRunnable);


        startTime = 0;  // Resets the timer back to 0 when the app with onResume state
    }


    private void sendNotification () {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("default", "Default", NotificationManager.IMPORTANCE_HIGH);
            NotificationManager notificationManager = getContext().getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

        NotificationCompat.Builder builder = new NotificationCompat.Builder(getContext(), "default")
                .setSmallIcon(R.drawable.reptrackerimage)
                .setContentTitle("Session Reminder")
                .setContentText("You still have an active session. Go back to the app to continue or finish!");


        //Pushes the notifications
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(getContext());
        if (ActivityCompat.checkSelfPermission(getContext(), android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        notificationManager.notify(NOTIFICATION_ID, builder.build());
    }
}
