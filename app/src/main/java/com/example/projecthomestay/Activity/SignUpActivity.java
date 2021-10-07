package com.example.projecthomestay.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.projecthomestay.R;

public class SignUpActivity extends AppCompatActivity {

    Button btn_DK,btn_login;
    EditText userName,password,getPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mapping();
        handleButtonAll();
    }

    public void mapping(){
        btn_DK = findViewById(R.id.btn_dk);
        btn_login = findViewById(R.id.btn_intent_DN);
        userName = findViewById(R.id.username_DK);
        password = findViewById(R.id.password_DK);
        getPassword = findViewById(R.id.password_DK_re);
    }
    public void handleButtonAll(){
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginActivity();
            }
        });

        btn_DK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateDK();
            }
        });
    }

    private void validateDK() {
        if(userName.getText().length() == 0 || password.getText().length() ==0 ||
            getPassword.getText().length() == 0
        ){
            Toast.makeText(SignUpActivity.this,
                    "Pass or Username is empty",Toast.LENGTH_LONG).show();
        }else if(!password.getText().toString().equals(getPassword.getText().toString())){
            Toast.makeText(SignUpActivity.this,
                    "Pass not math",Toast.LENGTH_LONG).show();
        }else if(userName.getText().length() < 6){
            Toast.makeText(SignUpActivity.this,
                    "Username > 6",Toast.LENGTH_LONG).show();
        }else if(true){
            Toast.makeText(SignUpActivity.this,
                    "SignUp Success",Toast.LENGTH_LONG).show();
            openLoginActivity();
        }
    }

    public  void openLoginActivity(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}