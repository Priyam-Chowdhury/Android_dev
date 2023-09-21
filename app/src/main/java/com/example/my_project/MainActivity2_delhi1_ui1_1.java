package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity2_delhi1_ui1_1 extends AppCompatActivity {

    Button b1  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_delhi1_ui11);
        b1 = findViewById(R.id.button427);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity2_delhi1_ui1_1.this,delhi1_ui1_1_map34.class);
                        startActivity(i);
                    }
                }
        );

    }
}