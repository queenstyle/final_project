package com.example.abcdeuser.project;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class region_first extends AppCompatActivity  implements View.OnClickListener , AdapterView.OnItemClickListener {
    //SQLiteDB mSQLiteDB = new SQLiteDB(region_first.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region_first);

        TextView title=(TextView)findViewById(R.id.region);
        Bundle bundle2=this.getIntent().getExtras();
        String text=bundle2.getString("string");
        title.setText(text);

     /*   Spinner spinner = (Spinner) findViewById(R.id.spinner);
        //建立一個ArrayAdapter物件，並放置下拉選單的內容
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,new String[]{"1000以下","1000~2000","2000~3000","3000以上"});
        //設定下拉選單的樣式
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);*/

        ListView listView= (ListView) findViewById(R.id.listView);
       List<HashMap<String , String>> list = new ArrayList<>();

       // String[] t1 = new String[]{"花境鄉村民宿" , "樹海翠湖" , "元氣屋"};
       String[] t2  = new String[]{"1500" , "2300" , "700"};
       String[] t1 = new String[]{"1","2","2"};
        //取得資料庫的指標
       // Cursor mCursor = mSQLiteDB.select();

       // 如果要一次取多筆資料的話可以使用迴圈方式讀取:
//        for(int i = 0 ; i < t2.length ; i++ )
//        {
//            //利用for迴圈切換指標位置
//            mCursor.moveToPosition(i);
//            //每筆姓名、年齡、性別、電話、地址資訊
//            t1[i] = mCursor.getString(mCursor.getColumnIndex("name"));
//        }
        for(int i = 0 ; i < t2.length ; i++){
            HashMap<String , String> hashMap = new HashMap<>();
            hashMap.put("t1" , t1[i]);
            hashMap.put("t2" , t2[i]);
            //把title , text存入HashMap之中
            list.add(hashMap);
            //把HashMap存入list之中
            ListAdapter listAdapter = new SimpleAdapter(this,list,R.layout.list_item_layout , new String[]{"t1" , "t2"} ,new int[]{R.id.text1 ,R.id.text2});
            // 5個參數 : context , List , layout , key1 & key2 , text1 & text2
            listView.setAdapter(listAdapter);
        }
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Bundle bundle = new Bundle();
        if (v == findViewById(R.id.back2)) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            intent.setClass(region_first.this, MainActivity.class);
            startActivity(intent);
        }
      /*  if(v==findViewById(R.id.check))
        {
           /* Intent intent=new Intent();
            intent.putExtras(bundle);
            intent.setClass(region_first.this,sort.class);
            startActivity(intent);
            // 建立一個 WebView
            android.webkit.WebView webview = new WebView(this);
            webview.getSettings().setJavaScriptEnabled(true);
            // 開啟 HTML5 Web Storage
            webview.getSettings().setDomStorageEnabled(true);
            setContentView(webview);
            webview.loadUrl("file:///android_asset/test_web4.html");
        }
        }*/
    }
        @Override
        public void onItemClick (AdapterView < ? > parent, View view,int position, long id){
            Intent intent = new Intent();
            intent.setClass(region_first.this, introduce.class);
            startActivity(intent);
        }
    }

