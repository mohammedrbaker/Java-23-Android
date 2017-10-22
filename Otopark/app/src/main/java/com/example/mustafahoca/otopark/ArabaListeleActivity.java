package com.example.mustafahoca.otopark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ArabaListeleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final MyDb myDb = new MyDb(getApplicationContext());
        setContentView(R.layout.activity_araba_listele);
        List<String> myList = new ArrayList<>();
//                myDb.getArabaAll().stream().map(item -> item.getId()).collect(Collectors.toList());
        for(Araba araba : myDb.getArabaAll()){
            myList.add(araba.getId());
        }
        final ListView listView = (ListView)findViewById(R.id.listViewAraba);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (ArabaListeleActivity.this,android.R.layout.simple_list_item_1,
                        android.R.id.text1,myList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String veri = (String)parent.getItemAtPosition(position);
                myDb.deleteAraba(veri);
                //TODO : foksiyonlastirilacak
                List<String> myList = new ArrayList<>();
//                myDb.getArabaAll().stream().map(item -> item.getId()).collect(Collectors.toList());
                for(Araba araba : myDb.getArabaAll()){
                    myList.add(araba.getId());
                }
                final ListView listView = (ListView)findViewById(R.id.listViewAraba);
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                        (ArabaListeleActivity.this,android.R.layout.simple_list_item_1,
                                android.R.id.text1,myList);
                listView.setAdapter(arrayAdapter);

            }
        });

    }
}
