package com.example.mustafahoca.otopark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void arabaEkle(View view) {
        Intent inIntent = new Intent(MainActivity.this, ArabaEkleActivity.class);
        startActivity(inIntent);
    }
}
