package com.example.foodhelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button clicks

        //leads to login page
        Button Facilitator_Button = (Button) findViewById(R.id.facilitator);
        Facilitator_Button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, activity_login_reg.class));
            }


        });

        //shelter button leading to login or register page
        Button shelter_Button = (Button) findViewById(R.id.Shelter);
        shelter_Button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, activity_login_reg.class));
            }
        });




    }


}
