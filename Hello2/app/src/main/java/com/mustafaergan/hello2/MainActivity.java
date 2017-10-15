package com.mustafaergan.hello2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void merhabaDe(View view){
        EditText editText = (EditText) findViewById(R.id.editTextIsim);
        String name = editText.getText().toString();
        String[] fikir = {"Kahve İçmeye Ne Dersin",
                            "Yürüş fena olmaz sanki",
                            "Nargile içelim mi?",
                            "Dans edelim mi?"};
        int veri = (int) ((Math.random()*100)%4);
        String fikirString = fikir[veri];
        String sonHal = name + " " + fikirString;
        Toast.makeText(this, sonHal, Toast.LENGTH_SHORT).show();
    }
}
