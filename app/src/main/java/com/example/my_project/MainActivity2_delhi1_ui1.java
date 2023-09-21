package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity2_delhi1_ui1 extends AppCompatActivity {

    ImageButton b1  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_delhi1_ui1);
        b1 = findViewById(R.id.imageButton38);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity2_delhi1_ui1.this,MainActivity2_delhi1_ui1_1.class);
                        startActivity(i);
                    }
                }
        );

    }
}