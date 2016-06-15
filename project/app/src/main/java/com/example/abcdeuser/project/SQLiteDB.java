package com.example.abcdeuser.project;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by fsa on 2016/6/14.
 */
public class SQLiteDB extends SQLiteOpenHelper {

    //db的名稱
    public final static String DATABASE_NAME = "SQLITDB";
    //db的版本
    public final static int DATABASE_VERSION = 1;

    public SQLiteDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//建立db的Table與Table裡的欄位項目
        String TABLE = "CREATE TABLE " + "sqldb" + " ("
                + "_id"  + " INTEGER primary key autoincrement, "
                +"region"+" text , "
                + "name" + " text , "
                + "phone" + " text , "
                + "price" + " text , "
                + "website" + " text , "
                + "address" + " text "+ ");";

        db.execSQL(TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    //指標，db指向sqldb的Table
    public Cursor select()
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query("sqldb", null, null, null, null, null, null);
        return cursor;
    }
    //新增db Table內容，帶入姓名、年齡、性別、電話、地址
    public long insert(String region,String name, String phone, String price, String website, String address)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("region",region);
        cv.put("name", name);
        cv.put("phone", phone);
        cv.put("price", price);
        cv.put("website", website);
        cv.put("address", address);
        long row = db.insert("sqldb", null, cv);
        return row;
    }
    //刪除Table單筆資料，帶入id
    public void delete(int id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        String where = "_id" + " = " + Integer.toString(id) ;
        db.delete("sqldb", where, null);
    }
    //刪除Table全部資料
    public void deleteAll()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + " sqldb");
    }
}
