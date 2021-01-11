package com.example.holidaysproject.tasks;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.holidaysproject.MainActivity;
import com.example.holidaysproject.R;

import java.util.Calendar;

public class Task4_5 extends AppCompatActivity {
    Button alert;
    Button date;
    Button time;
    Calendar calendar;
    DatePickerDialog dpd;
    TimePickerDialog tpd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task4_5);

        alert = findViewById(R.id.alertButton);
        date = findViewById(R.id.dateButton);
        time = findViewById(R.id.dateTimeButton);

        date.setOnClickListener(v -> {
            calendar = Calendar.getInstance();;
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int month = calendar.get(Calendar.MONTH);
            int year = calendar.get(Calendar.YEAR);

            dpd = new DatePickerDialog(Task4_5.this, (view, mYear, mMonth, mDay) ->
                    Toast.makeText(getApplicationContext(), mYear + "/" + (mMonth+=1) + "/" + mDay, Toast.LENGTH_SHORT).show(), year, month, day);
            dpd.show();
        });

        time.setOnClickListener(v -> {
            calendar = Calendar.getInstance();;
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            int minute = calendar.get(Calendar.MINUTE);

            tpd = new TimePickerDialog(Task4_5.this, (view, mHour, mMinute) ->
                    Toast.makeText(getApplicationContext(), mHour + ":" + mMinute, Toast.LENGTH_SHORT).show(), hour, minute, true);
            tpd.show();
        });

        alert.setOnClickListener(v -> {
            AlertDialog.Builder alertDialog2 = new AlertDialog.Builder(Task4_5.this);

            alertDialog2.setTitle("Alert");

            alertDialog2.setMessage("Click OK to continue, or Cancel to stop:");

            alertDialog2.setPositiveButton("OK", (dialog, which) -> {
                Toast.makeText(getApplicationContext(), "OK", Toast.LENGTH_SHORT).show();
            });

            alertDialog2.setNegativeButton("CANCEL", (dialog, which) -> {
                Toast.makeText(getApplicationContext(), "CANCELED", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            });

            alertDialog2.show();

        });

    }

}