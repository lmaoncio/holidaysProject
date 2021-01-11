package com.example.holidaysproject.lesson7.exercises;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.holidaysproject.R;
import com.google.android.material.textfield.TextInputEditText;

public class EditTextActivity extends AppCompatActivity {
    EditText number;
    TextView answer;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        number = findViewById(R.id.editTextNumber);
        answer = findViewById(R.id.answer);
        linearLayout = findViewById(R.id.linearLayout);

        number.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (number.getText().toString().equals("4")) {
                    answer.setText("RIGHT!");
                    answer.setTextColor(Color.GREEN);
                    linearLayout.setBackgroundColor(Color.GREEN);
                } else {
                    answer.setText("WRONG!");
                    linearLayout.setBackgroundColor(Color.RED);
                    answer.setTextColor(Color.RED);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}