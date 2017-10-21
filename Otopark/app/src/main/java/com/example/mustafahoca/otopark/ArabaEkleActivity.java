package com.example.mustafahoca.otopark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ArabaEkleActivity extends AppCompatActivity {

    MyDb myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_araba_ekle);
        myDb = new MyDb(getApplicationContext());
    }

    public void arabaEkle(View view) {
        EditText plaka = (EditText)findViewById(R.id.editTextPlaka);
        EditText isim = (EditText)findViewById(R.id.editTextISIM);
        myDb.veriEkle(plaka.toString(),isim.toString());
    }
}
