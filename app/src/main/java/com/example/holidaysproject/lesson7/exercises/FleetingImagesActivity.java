package com.example.holidaysproject.lesson7.exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.holidaysproject.R;

public class FleetingImagesActivity extends AppCompatActivity {
    ImageButton dangerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fleeting_images);

        dangerButton = findViewById(R.id.dangerButton);
        final MediaPlayer catSound = MediaPlayer.create(this, R.raw.meow);
        dangerButton.setOnClickListener(v -> {
            catSound.start();
        });
    }
}