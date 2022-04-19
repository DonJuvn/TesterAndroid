package com.example.quiztester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    EditText email_edittxt, password_edittxt;
    Button KiruBtn, SignInbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        KiruBtn = findViewById(R.id.KiruBtn);
        SignInbtn = findViewById(R.id.SignInbtn);
        email_edittxt = findViewById(R.id.email_edittxt);
        password_edittxt = findViewById(R.id.password_edittxt);

        KiruBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(email_edittxt.getText())){
                    email_edittxt.setError("please, fill in the blank");
                    return;
                }if(TextUtils.isEmpty(password_edittxt.getText())){
                    password_edittxt.setError("please, fill in the blank");
                    return;
                }

                if(email_edittxt.getText().toString().equals("user@gmail.com") &&
                        password_edittxt.getText().toString().equals("123123")){
                    Intent enterIntent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(enterIntent);
                }
                else{
                    Toast.makeText(LoginActivity.this, "Login or password is not correct", Toast.LENGTH_SHORT).show();
                }
            }
        });

        SignInbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registrationIntent = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(registrationIntent);
            }
        });
    }
}