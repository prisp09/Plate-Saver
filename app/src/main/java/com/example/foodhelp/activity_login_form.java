package com.example.foodhelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_login_form extends AppCompatActivity {
    Button loginbtn;
    EditText email, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        loginbtn = findViewById(R.id.Enter);
        email = findViewById(R.id.enter_email);
        pass = findViewById(R.id.editTextTextPassword3);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("facilitator@gmail.com") && pass.getText().toString().equals("password123")){
                    startActivity(new Intent(activity_login_form.this, activity_rest_form.class));
                }
                else if(email.getText().toString().equals("shelter@gmail.com") && pass.getText().toString().equals("password456")){
                    startActivity(new Intent(activity_login_form.this, MapsActivity.class));
                }
                else{
                    Toast.makeText(activity_login_form.this, "Wrong Credentials!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}