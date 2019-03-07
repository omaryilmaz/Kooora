package com.example.kooora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext=(Button) findViewById(R.id.BtnNext);
    }
    public void mm(View v)
    {
        Intent intent =new Intent(MainActivity.this,Main2Activity.class);
        //Intent intent =new Intent(MainActivity.this,Today.class);
        startActivity(intent);
    }


    public void statisMethod(View view) {
        Intent intent =new Intent(MainActivity.this,Main3Activity.class);
        //Intent intent =new Intent(MainActivity.this,Today.class);
        startActivity(intent);

    }
}
