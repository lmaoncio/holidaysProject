package com.example.holidaysproject.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.holidaysproject.R;

import java.util.ArrayList;

import static android.text.InputType.TYPE_CLASS_PHONE;
import static android.text.InputType.TYPE_DATETIME_VARIATION_DATE;
import static android.text.InputType.TYPE_DATETIME_VARIATION_TIME;
import static android.text.InputType.TYPE_NUMBER_VARIATION_NORMAL;
import static android.text.InputType.TYPE_TEXT_FLAG_CAP_SENTENCES;
import static android.text.InputType.TYPE_TEXT_FLAG_MULTI_LINE;
import static android.text.InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS;
import static android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD;
import static android.text.InputType.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;

public class Task1_2_3 extends AppCompatActivity {

    Spinner spinner;
    EditText keyboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1_2_3);

        spinner = findViewById(R.id.keyboardSpinner);
        keyboard = findViewById(R.id.keyboardEditText);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Text");
        arrayList.add("E-mail");
        arrayList.add("Postal");
        arrayList.add("Phone");
        arrayList.add("Number");
        arrayList.add("Password");
        arrayList.add("Time");
        arrayList.add("Date");
        arrayList.add("Multiline");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (spinner.getSelectedItemPosition()) {

                    case 0:
                        keyboard.setInputType(TYPE_TEXT_FLAG_CAP_SENTENCES);
                        break;
                    case 1:
                        keyboard.setInputType(TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
                        break;
                    case 2:
                        keyboard.setInputType(TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
                        break;
                    case 3:
                        keyboard.setInputType(TYPE_CLASS_PHONE);
                        break;
                    case 4:
                        keyboard.setInputType(TYPE_NUMBER_VARIATION_NORMAL);
                        break;
                    case 5:
                        keyboard.setInputType(TYPE_TEXT_VARIATION_PASSWORD);
                        break;
                    case 6:
                        keyboard.setInputType(TYPE_DATETIME_VARIATION_TIME);
                        break;
                    case 7:
                        keyboard.setInputType(TYPE_DATETIME_VARIATION_DATE);
                        break;
                    case 8:
                        keyboard.setInputType(TYPE_TEXT_FLAG_MULTI_LINE);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}