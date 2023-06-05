package com.example.testacrivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button btnactiv4 =findViewById(R.id.btnactiv4);
        Button btnactivity6 =findViewById(R.id.btnactivity6);
        btnactiv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goac4 =new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(goac4);
            }
        });
        btnactivity6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goacc4=new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(goacc4);
            }
        });
    }
}