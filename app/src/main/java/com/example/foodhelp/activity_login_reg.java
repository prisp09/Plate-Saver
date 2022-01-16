package com.example.foodhelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_login_reg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_reg);

        //login button leading to login form
        Button login_Button = (Button) findViewById(R.id.Login2);
        login_Button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(activity_login_reg.this, activity_login_form.class));
            }
        });

        //registration button leading to login form
        Button reg_Button = (Button) findViewById(R.id.Register);
        reg_Button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(activity_login_reg.this, activity_registeration_form.class));
            }
        });
    }



}