package com.example.foodhelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_registeration_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration_form);

        //leads to completion of registeration
        Button Register_Button = (Button) findViewById(R.id.register);
        Register_Button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(activity_registeration_form.this, register_Note.class));
            }
        });
    }
}