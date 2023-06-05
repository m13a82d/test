package com.example.testacrivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {
private int score =0;
private RadioGroup radioGroup555;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RadioGroup radioGroup555 =findViewById(R.id.radiogroup555);
        Button btnactivity1 =findViewById(R.id.btnactivity1);
        Button btnactivity3 =findViewById(R.id.btnactivity3);

        btnactivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnactivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("score",score);
                startActivity(intent);
            }
        });
    }
}