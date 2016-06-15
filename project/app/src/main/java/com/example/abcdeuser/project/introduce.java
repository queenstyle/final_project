package com.example.abcdeuser.project;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class introduce extends AppCompatActivity  {

    SQLiteDB mSQLiteDB = new SQLiteDB(introduce.this);
    private String[] Regions = {"花蓮市","花蓮市","花蓮市"};
    private String[] Names = {"雲天樓","香榭城市","築夢民宿"};
    private String[] Ages = {"038-563333","0928-095-111","0921-171-798"};
    private String[] Sexs = {"1500","1500","2800"};
    private String[] Phones = {"http://city.hlplay.tw/bnb/cloud.htm","http://city.hlplay.tw/bnb/champscity.htm","http://city.hlplay.tw/bnb/chudream.htm"};
    private String[] Addresss = {"花蓮市建興街56號","花蓮市自由街94號","花蓮市國聯五路11"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduce);

        TextView tv1 = (TextView) findViewById(R.id.textView2);
        TextView tv3 = (TextView) findViewById(R.id.textView3);
        TextView tv4 = (TextView) findViewById(R.id.textView4);
        TextView tv5 = (TextView) findViewById(R.id.textView5);
        TextView tv6 = (TextView) findViewById(R.id.textView6);

        Cursor mCursor = mSQLiteDB.select();
       // mCursor.moveToFirst();
       // String Name = mCursor.getString(1);
        for(int i = 0 ; i < Names.length ; i++)
        {
            mSQLiteDB.insert(Regions[i],Names[i], Ages[i] , Sexs[i] , Phones[i], Addresss[i]);
        }
      //  mSQLiteDB.close();
        mCursor.moveToPosition(0);
        String R = mCursor.getString(mCursor.getColumnIndex("region"));
        String Name = mCursor.getString(mCursor.getColumnIndex("name"));
        String Age = mCursor.getString(mCursor.getColumnIndex("phone"));
        String Sex = mCursor.getString(mCursor.getColumnIndex("price"));
        String Phone = mCursor.getString(mCursor.getColumnIndex("website"));
        String Address = mCursor.getString(mCursor.getColumnIndex("address"));
        tv1.setText(Name);
        tv3.setText(Age);
        tv4.setText(Sex);
        tv5.setText(Phone);
        tv6.setTextColor(0xFFFF000);
        tv6.setText(Address);
        mSQLiteDB.close();

    }
   // @Override
//    public void onClick(View v) {
//        Bundle bundle = new Bundle();
//        if (v == findViewById(R.id.back3)) {
//            Intent intent = new Intent();
//            intent.putExtras(bundle);
//            intent.setClass(introduce.this, MainActivity.class);
//            startActivity(intent);
//        }
//        if (v == findViewById(R.id.jump)) {
//            Intent intent = new Intent();
//            intent.putExtras(bundle);
//            intent.setClass(introduce.this, region_first.class);
//            startActivity(intent);
//        }
//    }


}
