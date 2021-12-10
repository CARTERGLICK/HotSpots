package com.example.hotspots;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Countercounter extends AppCompatActivity {
    public static final String PERCENTAGE = "percentage";
    private TextView counterTV;
    private TextView counterTVs;
    private Button madeButton;
    private Button missButton;
    private Counter counter;
   // public static final String VALUE_KEY = "counter_value";

    public void goToHotSpot(View view) {
        counter.setPercentage();
        Intent intent = new Intent(this, HotSpotsActivity.class);
      intent.putExtra(PERCENTAGE, counter.getPercentage());
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countercounter);
        counterTV = findViewById(R.id.madeShots);
        counterTVs = findViewById(R.id.missShots);
        madeButton = findViewById(R.id.madeButton);
        missButton = findViewById(R.id.missButton);
        counter = new Counter();
       // int value = savedInstanceState.getInt(VALUE_KEY, 0);


    }

    public void madeBasket(View view) {
        counter.madeBasket();
        counterTV.setText(String.valueOf(counter.getValue()));
    }


    public void missButton(View view) {
        counter.missBasket();
        counterTVs.setText(String.valueOf(counter.getValue()));
    }
}


