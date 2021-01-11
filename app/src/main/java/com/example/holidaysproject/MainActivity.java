package com.example.holidaysproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.holidaysproject.lesson7.Lesson7Activity;
import com.example.holidaysproject.tasks.Task1_2_3;
import com.example.holidaysproject.tasks.Task4_5;
import com.example.holidaysproject.tasks.Task6_7;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("LESSON 7");
        arrayList.add("TASK 1, 2 , 3");
        arrayList.add("TASK 4, 5");
        arrayList.add("TASK 6, 7");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            if (position == 0) {
                Intent intent = new Intent(view.getContext(), Lesson7Activity.class);
                startActivity(intent);
            }
            if (position == 1) {
                Intent intent = new Intent(view.getContext(), Task1_2_3.class);
                startActivity(intent);
            }
            if (position == 02) {
                Intent intent = new Intent(view.getContext(), Task4_5.class);
                startActivity(intent);
            }
            if (position == 3) {
                Intent intent = new Intent(view.getContext(), Task6_7.class);
                startActivity(intent);
            }
            if (position == 4) {
                Intent intent = new Intent(view.getContext(), Lesson7Activity.class);
                startActivity(intent);
            }
            if (position == 5) {
                Intent intent = new Intent(view.getContext(), Lesson7Activity.class);
                startActivity(intent);
            }
        });
    }
}