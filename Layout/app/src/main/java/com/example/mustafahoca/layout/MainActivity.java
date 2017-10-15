package com.example.mustafahoca.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextIsim;
    EditText editTextSifre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //admin 1234
    public void login(View view) {
        editTextIsim = (EditText) findViewById(R.id.edtiTextIsim);
        editTextSifre = (EditText) findViewById(R.id.editTextSifre);

        String isim = editTextIsim.getText().toString();
        String sifre = editTextSifre.getText().toString();

        if(isim.equals("admin")&&sifre.equals("1234")){
            Intent inIntent =new Intent(MainActivity.this,UserActivity.class);
            startActivity(inIntent);

            Toast.makeText(this, "Başarı", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Başarısız", Toast.LENGTH_SHORT).show();
        }

    }


}
