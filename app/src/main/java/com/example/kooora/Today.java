package com.example.kooora;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;

public class Today extends AppCompatActivity {
    public static final String DATE_FORMAT_2 = "dd-MMM-yyyy";
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);
        setContentView(R.layout.activity_main);

        //TimePicker simpleTimePicker=(TimePicker)findViewById(R.id.DTtime); // initiate a time picker
// set the value for current hours
       // // simpleTimePicker.setCurrentHour(10); // before api level 23
       // simpleTimePicker.setHour(0); // from api level 23
       // simpleTimePicker.setMinute(15);
       // simpleTimePicker.setBackgroundColor(Color.YELLOW);
        //Bundle extras=getIntent().getExtras();
    }

}
