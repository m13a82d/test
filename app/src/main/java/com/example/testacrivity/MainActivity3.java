package com.example.testacrivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button buttonactiv2 =findViewById(R.id.buttonactiv2);
        Button btnactivity4 =findViewById(R.id.btnactivity4);
        buttonactiv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goac2 =new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(goac2);
            }
        });
        btnactivity4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goac4 = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(goac4);
            }
        });
    }
}