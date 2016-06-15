package com.example.abcdeuser.project;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class select_region extends AppCompatActivity  {
    String string;

    public String[] list = {"花蓮市", "吉安鄉", "壽豐鄉", "鳳林鎮", "光復鄉", "瑞穗鄉", "豐濱鄉", "玉里鎮", "富里鄉", "新城鄉", "秀林鄉", "萬榮鄉", "卓溪鄉"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_region);
        Toast.makeText(this.getApplicationContext(), "點擊地區可查看民宿",
                Toast.LENGTH_LONG).show();


        listView = (ListView) findViewById(R.id.listView4);
        ArrayList<HashMap<String, Object>> Item = new ArrayList<HashMap<String, Object>>();
        for (int i = 0; i < 13; i++) {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("ItemImage", R.drawable.go);
            map.put("ItemName", "WWW");
            map.put("ItemButton", R.id.ItemButton);
            Item.add(map);
        }
        listView.setAdapter(new ListAdapter(this, Item));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent();
                intent.setClass(select_region.this, region_first.class);
                Bundle bundle = new Bundle();
                bundle.putInt("id", position);
                TextView title = (TextView) view.findViewById(R.id.ItemName);
                string = title.getText().toString();
                bundle.putString("string", string);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
    public void myDialog(final int id) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if(id==0)
            builder.setMessage("東大門夜市\n松園別館\n北濱公園\n舊鐵道文化商圈\n花蓮港景觀橋\n石雕博物館\n時光二手書店\n慈濟靜思堂");
        else if(id==1)
            builder.setMessage("鬱金香花園\n楓林步道\n慶修院\n知卡宣森林公園\n全豐牧場\n");
        else if(id==2)
            builder.setMessage("花蓮海洋公園\n鯉魚潭\n立川漁場\n池南森林遊樂區\n鳥居\n親水生態公園\n東華大學\n牛山呼庭\n米棧古道\n白鮑溪");
        else if(id==3)
            builder.setMessage("鳳凰瀑布風景區\n林田山林業文化園區\n鳳林校長夢工廠\n月廬");
        else if(id==4)
            builder.setMessage("綠色迷宮\n花蓮觀光糖廠\n大農大富平地森林園區\n大興紀念公園");
        else if(id==5)
            builder.setMessage("瑞穗牧場\n秀姑巒溪泛舟遊客中心\n瑞穗溫泉\n青蓮寺\n富源森林遊樂區");
        else if(id==6)
            builder.setMessage("磯崎海水浴場\n石梯坪遊憩區\n長虹橋\n親不知子斷崖\n人定勝天紀念碑");
        else if(id==7)
            builder.setMessage("赤柯山金針花\n竹林湖\n小蜜蜂有機農場\n連家古厝");
        else if(id==8)
            builder.setMessage("六十石山金針農園\n泥火山漁池\n羅山瀑布\n土埆厝");
        else if(id==9)
            builder.setMessage("七星潭風景區\n原野牧場\n七星柴魚博物館\n慈濟靜思精舍\n龍泉親水公園");
        else if(id==10)
            builder.setMessage("清水斷崖\n太魯閣國家公園\n砂卡礑步道\n白楊瀑布\n天祥\n燕子口\n三棧溪風景區\n立霧溪");
        else if(id==11)
            builder.setMessage("明利飛行傘起飛場\n二子山野溪溫泉區\n西寶溫泉");
        else if(id == 12)
            builder.setMessage("八通關古道\n南安瀑布\n崙天布農園區\n瓦拉米步道");


        builder.setPositiveButton("確認", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        AlertDialog ad = builder.create();
        ad.show();
    }

}