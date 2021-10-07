package com.example.projecthomestay.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.projecthomestay.R;

public class LoginActivity extends AppCompatActivity {


    EditText username,password;
    Button btnLogin, btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mappingView();
        handleBtnALl();
    }

    private void mappingView() {
        username = findViewById(R.id.username_LG);
        password = findViewById(R.id.password_LG);
        btnLogin = findViewById(R.id.btn_login_LG);
        btnSignUp = findViewById(R.id.btn_signup_LG);
    }

    private void handleBtnALl() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().length()==0 || password.getText().length()==0){
                    Toast.makeText(LoginActivity.this,
                            "Pass or Username is empty",Toast.LENGTH_LONG).show();
                }
                opentActivityApp();
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitySignUp();
            }
        });
    }

    public void openActivitySignUp(){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

    public void opentActivityApp(){
        Intent intent = new Intent(this, AppActivity.class);
        startActivity(intent);
    }
}