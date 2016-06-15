package com.example.abcdeuser.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class favorite extends AppCompatActivity   implements  AdapterView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        ListView listView= (ListView) findViewById(R.id.listView3);
        List<HashMap<String , String>> list = new ArrayList<>();

        String[] t1 = new String[]{"花境鄉村民宿" , "樹海翠湖" , "元氣屋"};
        String[] t2  = new String[]{"1500" , "2300" , "700"};

        for(int i = 0 ; i < t1.length ; i++){
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
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent();
        intent.setClass(favorite.this,introduce.class);
        startActivity(intent);
    }
}
