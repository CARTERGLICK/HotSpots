package com.example.hotspots;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class Countercounter extends AppCompatActivity {
    public static final String PERCENTAGE = "percentage";
    public static final String LOCATION = "location";
    private int row;
    private TextView counterTV;
    private TextView counterTVs;
    private Button madeButton;
    private Button missButton;
    private Counter counter;
    //private List<HotSpot> hotSpots;
   // public static final String VALUE_KEY = "counter_value";

    public void goToHotSpot(View view) {
        counter.setPercentage();
        Integer percent= counter.getPercentage();
       // Integer percent = hotSpots.get(row).getPercentage();
        Intent intent = new Intent(this, HotSpotsActivity.class);
      intent.putExtra(PERCENTAGE,percent);
      intent.putExtra(LOCATION, row);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countercounter);
      //  hotSpots = new ArrayList<>();
       // getHotSpots();
        counterTV = findViewById(R.id.madeShots);
        counterTVs = findViewById(R.id.missShots);
        madeButton = findViewById(R.id.madeButton);
        missButton = findViewById(R.id.missButton);
        counter = new Counter();
        int loc = getIntent().getIntExtra(Chooseyourspot.LOC,0);
        row = loc;

       // int value = savedInstanceState.getInt(VALUE_KEY, 0);


    }

   // private void getHotSpots() {
        //SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", MODE_PRIVATE);
        //String hotSpotsString = sharedPreferences.getString("hot_spots_key", null);
       // if(hotSpotsString == null){
         //   for (int i = 0; i < 5; i++) {
          //      hotSpots.add(new HotSpot());
         //   }
        //} else {
        //    Gson gson = new Gson();
        //    TypeToken<List<HotSpot>> token = new TypeToken<List<HotSpot>>() {};
        //    hotSpots = gson.fromJson(hotSpotsString, token.getType());
      //  }

  //  }

    public void madeBasket(View view) {
        counter.madeBasket();
        counterTV.setText(String.valueOf(counter.getValue()));
       // hotSpots.get(row).madeAttempt();
      //  counterTV.setText(String.valueOf(hotSpots.get(row).getMade()));
    }


    public void missButton(View view) {
        counter.missBasket();
        counterTVs.setText(String.valueOf(counter.getMissTotal()));
       // hotSpots.get(row).missAttempt();
       // int misses = hotSpots.get(row).getAttempts() - hotSpots.get(row).getMade();
       // counterTVs.setText(String.valueOf(misses));
    }
}


