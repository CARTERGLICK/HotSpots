package com.example.hotspots;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HotSpotsActivity extends AppCompatActivity {
    private TextView leftCorner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_spots);
        Intent intent = getIntent();
        Integer percent= intent.getIntExtra(Countercounter.PERCENTAGE, 0);
       Counter counter = new Counter();
        if(counter.getrC()){

        }
    }
}