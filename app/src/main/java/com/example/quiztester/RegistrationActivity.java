package com.example.quiztester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    EditText name_input, surname_input, email_input, password_input;
    Button RegistBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        surname_input = findViewById(R.id.surname_input);
        email_input = findViewById(R.id.email_input);
        password_input = findViewById(R.id.password_input);
        name_input = findViewById(R.id.name_input);
        RegistBtn = findViewById(R.id.RegistBtn);
//        name_input
        RegistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean correct = true;

                if(TextUtils.isEmpty(name_input.getText())){
                    name_input.setError("please, fill in the blank");
                    correct = false;
                }
                if(TextUtils.isEmpty(surname_input.getText())){
                    surname_input.setError("please, fill in the blank");
                    correct = false;
                }
                if(TextUtils.isEmpty(email_input.getText())){
                    email_input.setError("please, fill in the blank");
                    correct = false;
                }
                if(TextUtils.isEmpty(password_input.getText())){
                    password_input.setError("please, fill in the blank");
                    correct = false;
                }

                if (correct == true) {
                    Intent registrationIntent = new Intent(RegistrationActivity.this, MainActivity.class);
                    startActivity(registrationIntent);
                }else{
                    Toast.makeText(RegistrationActivity.this, "please, fill in the blanks", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}