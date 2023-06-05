package com.example.testacrivity;

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
        Button btnactivity2 =findViewById(R.id.btnactivity2);
        btnactivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainactivity =new Intent(MainActivity.this,MainActivity2.class);
                startActivity(mainactivity);
            }
        });
    }
}