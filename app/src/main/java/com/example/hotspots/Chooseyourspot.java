package com.example.hotspots;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class Chooseyourspot extends AppCompatActivity {
    private RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseyourspot);
        Counter counter = new Counter();
        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                switch (i){
                    case R.id.rightCornerThree:
                        counter.setrC(true);
                        break;
                    case R.id.rightWingThree:
                        counter.setrW(true);
                        break;
                    case R.id.topOfKeyThree:
                        counter.settK(true);
                        break;
                    case R.id.leftWingThree:
                        counter.setlW(true);
                        break;
                    case R.id.leftCornerThree:
                        counter.setlC(true);
                        break;
                }
            }
        });

    }
    public void goToCounter(View view){
        Intent intent = new Intent(this, Countercounter.class);
        startActivity(intent);
    }

}