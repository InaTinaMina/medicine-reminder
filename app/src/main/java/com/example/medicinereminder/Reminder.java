package com.example.medicinereminder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Reminder extends AppCompatActivity {

    EditText etHour,etMinute;
    Button btnTime, btnAlarm;
    TimePickerDialog timePickerDialog;
    Calendar calendar;
    int currentHour;
    int currentMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder2);

        etHour = findViewById(R.id.etHour);
        etMinute = findViewById(R.id.etMinute);
        btnTime = findViewById(R.id.btnTime);
        btnAlarm = findViewById(R.id.btnAlarm);

        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar = Calendar.getInstance();
                currentHour = calendar.get(Calendar.HOUR_OF_DAY);
                currentMinute = calendar.get(Calendar.MINUTE);

                timePickerDialog = new TimePickerDialog(Reminder.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        etHour.setText(String.format("%02d", hourOfDay));
                        etMinute.setText(String.format("%02d",minute));
                    }
                }, currentHour, currentMinute, false);
                timePickerDialog.show();
            }

        });

        btnAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!etHour.getText().toString().isEmpty() && !etMinute.getText().toString().isEmpty())
                {
                    Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
                    intent.putExtra(AlarmClock.EXTRA_HOUR, Integer.parseInt(etHour.getText().toString()));
                    intent.putExtra(AlarmClock.EXTRA_MINUTES, Integer.parseInt(etMinute.getText().toString()));
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Reminder.this, "Please choose a time", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}