package com.example.hotspots;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HotSpotsActivity extends AppCompatActivity {
    private TextView lC;
    private TextView lW;
    private TextView tOK;
    private TextView rW;
    private TextView rC;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_spots);

       lC= findViewById(R.id.leftCornerP);
       lW = findViewById(R.id.leftWingP);
        tOK = findViewById(R.id.topKeyP);
        rW = findViewById(R.id.rightWingP);
        rC = findViewById(R.id.rightCornerP);
        int percent = getIntent().getIntExtra(Countercounter.PERCENTAGE,0);
        int loc = getIntent().getIntExtra(Countercounter.LOCATION,0);
        if(loc == 1){
            rC.setText(String.valueOf(percent + "%"));

        }
        if(loc==2){
            rW.setText(String.valueOf(percent)+ "%" );
        }
        if(loc==3){
            tOK.setText(String.valueOf(percent) + "%");
        }
        if(loc==4){
            lW.setText(String.valueOf(percent)+ "%");
        }
        if(loc==5){
            lC.setText(String.valueOf(percent)+ "%");
        }

    }
    public void goToStart(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}