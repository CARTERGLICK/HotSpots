package com.example.hotspots;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToSpot(View view){
        Intent intent = new Intent(this, Chooseyourspot.class);
        startActivity(intent);
    }
    public void goToPurpose(View view){
        Intent intent = new Intent(this, PurposeActivity.class);
        startActivity(intent);
    }
}