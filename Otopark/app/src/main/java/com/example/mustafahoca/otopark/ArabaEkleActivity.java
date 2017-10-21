package com.example.mustafahoca.otopark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        myDb.veriEkle(plaka.getText().toString(),isim.getText().toString());
        Toast.makeText(this, "Veri Ekle", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.araba_ekle_menu,menu);
        return true;
    }

    public void listele(MenuItem item) {
        Intent inIntent = new Intent(ArabaEkleActivity.this, ArabaListeleActivity.class);
        startActivity(inIntent);
    }

    public void cikis(MenuItem item) {
        Intent inIntent = new Intent(ArabaEkleActivity.this,MainActivity.class);
        startActivity(inIntent);
    }
}
