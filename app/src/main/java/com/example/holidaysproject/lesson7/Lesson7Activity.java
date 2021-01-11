package com.example.holidaysproject.lesson7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.holidaysproject.R;
import com.example.holidaysproject.lesson7.exercises.ButtonsActivity;
import com.example.holidaysproject.lesson7.exercises.CheckBoxesActivity;
import com.example.holidaysproject.lesson7.exercises.EditTextActivity;
import com.example.holidaysproject.lesson7.exercises.FleetingImagesActivity;
import com.example.holidaysproject.lesson7.exercises.LabelsActivity;

import java.util.ArrayList;

public class Lesson7Activity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson7);

        listView = findViewById(R.id.listView);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Assigning labels");
        arrayList.add("Buttons");
        arrayList.add("Fleeting images & sound effects");
        arrayList.add("EditText & colors");
        arrayList.add("CheckBoxes & Radio buttons");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            if (position == 0) {
                Intent intent = new Intent(view.getContext(), LabelsActivity.class);
                startActivity(intent);
            }
            if (position == 1) {
                Intent intent = new Intent(view.getContext(), ButtonsActivity.class);
                startActivity(intent);
            }
            if (position == 02) {
                Intent intent = new Intent(view.getContext(), FleetingImagesActivity.class);
                startActivity(intent);
            }
            if (position == 3) {
                Intent intent = new Intent(view.getContext(), EditTextActivity.class);
                startActivity(intent);
            }
            if (position == 4) {
                Intent intent = new Intent(view.getContext(), CheckBoxesActivity.class);
                startActivity(intent);
            }
        });
    }
}