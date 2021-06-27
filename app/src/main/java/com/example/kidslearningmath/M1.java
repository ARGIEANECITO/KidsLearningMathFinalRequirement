package com.example.kidslearningmath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class M1 extends AppCompatActivity {
    Button A,B,C,D;
    Intent intent,intent2,intent3,intent4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1);
        A=(Button)findViewById(R.id.b5);
        B=(Button)findViewById(R.id.b2);
        C=(Button)findViewById(R.id.b3);
        D=(Button)findViewById(R.id.b4);
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), mul1.class);
                startActivity(intent);
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent2= new Intent(getApplicationContext(), div1.class);
                startActivity(intent2);
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent3 = new Intent(getApplicationContext(), add1.class);
                startActivity(intent3);
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent4 = new Intent(getApplicationContext(), sub1.class);
                startActivity(intent4);
            }
        });
    }
}