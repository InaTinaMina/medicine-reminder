package com.example.medicinereminder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sign_up extends AppCompatActivity {

    TextView tvName, tvPhone, tvemail, tvPass, tvConfirmPass;
    EditText etName, etPhone, etEmailid, etPass, etConfirmPass;
    Button btnSIGNUP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        tvName = findViewById(R.id.tvName);
        tvPhone = findViewById(R.id.tvPhone);
        tvemail = findViewById(R.id.tvemail);
        tvPass = findViewById(R.id.tvPass);
        tvConfirmPass = findViewById(R.id.tvConfirmPass);
        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        etEmailid = findViewById(R.id.etEmailid);
        etPass = findViewById(R.id.etPass);
        etConfirmPass = findViewById(R.id.etConfirmPass);
        btnSIGNUP = findViewById(R.id.btnSIGNUP);

        btnSIGNUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sign_up.this, com.example.medicinereminder.Home_Page.class);
                startActivity(intent);
            }
        });
    }
}