package com.example.hotspots;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class Chooseyourspot extends AppCompatActivity {
    public static final String LOC = "location";
    Integer loc;
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
                       loc=1;
                        break;
                    case R.id.rightWingThree:
                        loc=2;
                        break;
                    case R.id.topOfKeyThree:
                        loc=3;
                        break;
                    case R.id.leftWingThree:
                       loc=4;
                        break;

                    case R.id.leftCornerThree:
                        loc=5;
                        break;
                }
            }
        });


    }
    public void goToCounter(View view){
        Intent intent = new Intent(this, Countercounter.class);

        Integer ren= loc;
        intent.putExtra(LOC,ren);
        startActivity(intent);
    }

}