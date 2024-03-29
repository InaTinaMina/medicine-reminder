package com.example.medicinereminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

class HomepageActivity extends AppCompatActivity {

    Button btnReminder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        btnReminder = findViewById(R.id.btnReminder);

        btnReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomepageActivity.this,
                        com.example.medicinereminder.Reminder.class);
                startActivity(intent);
            }
        });
    }
}