package com.example.kooora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity    {

    Spinner spinner1;
    ImageView imgLeg1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        spinner1 =(Spinner) findViewById(R.id.spinner);
        imgLeg1 = (ImageView) findViewById(R.id.imgLeg);

        //ArrayList<String> arrLeg =new ArrayList<String>();
       // arrLeg.add("الدوري الاسباني");
       // arrLeg.add("الدوري الايطالي");
       // arrLeg.add("الدوري الانكليزي");
        String[] arrLeg = {"Select" ,"الدوري الاسباني", "الدوري الايطالي", "الدوري الانكليزي", };

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,arrLeg);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(aa);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String type = (String) parent.getItemAtPosition(position);
                switch (type) {
                    case "الدوري الاسباني":

                         imgLeg1.setImageResource(R.drawable.spain);
                        break;

                    case "الدوري الايطالي":
                        imgLeg1.setImageResource(R.drawable.italy);
                        break;

                    case "الدوري الانكليزي":
                        imgLeg1.setImageResource(R.drawable.eng);
                        break;
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void mm(View v)
    {
        Intent intent =new Intent(Main3Activity.this,MainActivity.class);
        //Intent intent =new Intent(MainActivity.this,Today.class);
        startActivity(intent);
    }

}
