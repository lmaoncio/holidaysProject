package com.example.holidaysproject.lesson7.exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.holidaysproject.R;

public class CheckBoxesActivity extends AppCompatActivity {
    CheckBox isChecked;
    RadioButton redRadioButton;
    RadioButton greenRadioButton;
    RadioButton blueRadioButton;
    RadioGroup colorsRadioGroup;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_boxes);

        isChecked = findViewById(R.id.checkBox);
        redRadioButton = findViewById(R.id.redRadioButton);
        greenRadioButton = findViewById(R.id.greenRadioButton);
        blueRadioButton = findViewById(R.id.blueRadioButton);
        colorsRadioGroup = findViewById(R.id.ColorsRadioButtonGroup);
        linearLayout = findViewById(R.id.LinearLayout);

        isChecked.setOnClickListener(v -> {
            if (isChecked.isChecked()) {
                isChecked.setText("IS CHECKED");
            } else {
                isChecked.setText("IS NOT CHECKED");
            }
        });

        colorsRadioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (redRadioButton.isChecked()) {
                linearLayout.setBackgroundColor(Color.RED);
                isChecked.setBackgroundColor(Color.BLUE);
            }
            if (greenRadioButton.isChecked()) {
                linearLayout.setBackgroundColor(Color.GREEN);
                isChecked.setBackgroundColor(Color.RED);
            }
            if (blueRadioButton.isChecked()) {
                linearLayout.setBackgroundColor(Color.BLUE);
                isChecked.setBackgroundColor(Color.GREEN);
            }
        });
    }
}