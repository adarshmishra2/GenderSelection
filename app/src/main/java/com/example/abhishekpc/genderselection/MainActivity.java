package com.example.abhishekpc.genderselection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radio;
    private RadioButton radiobutton,rb1,rb2;
    private Button btndisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radio = (RadioGroup) findViewById(R.id.raidogrp);
        rb1 = (RadioButton) findViewById(R.id.male);
        rb2 = (RadioButton) findViewById(R.id.female);
        btndisplay=(Button) findViewById(R.id.selection);
        btndisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = radio.getCheckedRadioButtonId();
                radiobutton = (RadioButton) findViewById(selectedId);
                Toast.makeText(MainActivity.this, radiobutton.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
