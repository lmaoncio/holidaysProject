package com.example.holidaysproject.lesson7.exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.holidaysproject.R;

import java.util.Date;

public class ButtonsActivity extends AppCompatActivity {
    Button timeButton;
    TextView timeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        timeButton = findViewById(R.id.timeButton);
        timeTextView = findViewById(R.id.timeTextView);
    }

    public void someMethod(View theButton) {
        String currentDateTimeString = java.text.DateFormat.getDateTimeInstance().format(new Date());
        timeTextView.setText(currentDateTimeString);
    }
}