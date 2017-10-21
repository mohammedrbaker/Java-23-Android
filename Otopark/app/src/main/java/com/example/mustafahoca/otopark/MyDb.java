package com.example.mustafahoca.otopark;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by mustafahoca on 21.10.2017.
 */

public class MyDb extends SQLiteOpenHelper {

    static String DBName = "otopark";
    static int DBVersion = 1;
    String createTable = "CREATE TABLE ARABA(id TEXT, name TEXT)";
    String selectAllSQL = "SELECT * FROM ARABA";
    String selectByIdSQL = "SELECT * FROM ARABA WHERE ID = %s";

    public void veriEkle(String id, String name){
        SQLiteDatabase sqlite = super.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", id);
        contentValues.put("name", name);
        sqlite.insert("ARABA",null,contentValues);
    }

    public void veriEkle(Araba araba){
        SQLiteDatabase sqlite = super.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", araba.getId());
        contentValues.put("name", araba.getName());
        sqlite.insert("ARABA",null,contentValues);
    }

    public List<Araba> getArabaAll(){
        List<Araba> arabaList = new ArrayList<>();
        SQLiteDatabase sqLite = super.getReadableDatabase();
        Cursor cursor = sqLite.rawQuery(selectAllSQL,null);
        Araba araba = null;
        while (cursor.moveToNext()){
            araba = new Araba();
            araba.setId(cursor.getString(0));
            araba.setName(cursor.getString(1));
            arabaList.add(araba);
        }
        return arabaList;
    }

    public Araba getArabaById(String id){
        SQLiteDatabase sqLite = super.getReadableDatabase();
        String SQL = String.format(selectByIdSQL,id);
        Cursor cursor = sqLite.rawQuery(SQL,null);
        Araba araba = null;
        while (cursor.moveToFirst()){
            araba = new Araba();
            araba.setId(cursor.getString(0));
            araba.setName(cursor.getString(1));
        }
        return araba;
    }

    public void deleteAraba(String id){
        SQLiteDatabase sqLite = super.getWritableDatabase();
        sqLite.delete("ARABA","Name = ?",new String[]{String.valueOf(id)});
    }



    public MyDb(Context context) {
        super(context, DBName, null, DBVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
