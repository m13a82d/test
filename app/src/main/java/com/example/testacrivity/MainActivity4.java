package com.example.testacrivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button btnactivity5 =findViewById(R.id.btnactivity5);
        Button btnactiv3 =findViewById(R.id.btnactiv3);
        btnactiv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goacc3 =new Intent(MainActivity4.this,MainActivity3.class);
                startActivity(goacc3);
            }
        });
        btnactivity5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goac5 =new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(goac5);
            }
        });
    }
}