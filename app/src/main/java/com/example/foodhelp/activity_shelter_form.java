package com.example.foodhelp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_shelter_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter_form);

        Button req = (Button) findViewById(R.id.Request);

        req.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity_shelter_form.this, "Registration Successful!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}