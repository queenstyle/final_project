package com.example.abcdeuser.project;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   // SQLiteDB mSQLiteDB = new SQLiteDB(MainActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button change=(Button)findViewById(R.id.select1);
        change.setOnClickListener(this);

       // db = openOrCreateDatabase(db_name,  Context.MODE_PRIVATE, null);

//        String createTable1="CREATE TABLE IF NOT EXISTS " +
//                tb1_name +            // 資料表名稱
//                "(name VARCHAR(32), " +    //姓名欄位
//                "phone VARCHAR(16), " +    //電話欄位
//                "price INTEGER ,"+            //價錢
//                "email VARCHAR(64),"+      //Email欄位
//                "address VARCHAR(64))";
//        db.execSQL(createTable1);    // 建立資料表
//
//        // 插入 3筆資料
//        addData1("雲天樓", "038-563333", 1500, "http://city.hlplay.tw/bnb/cloud.htm", "花蓮市建興街56號");
//        addData1("香榭城市", "0928-095-111", 1500, "http://city.hlplay.tw/bnb/champscity.htm", "花蓮市自由街94號");
//        addData1("築夢民宿","0921-171-798",2800,"http://city.hlplay.tw/bnb/chudream.htm","花蓮市國聯五路11-2 號");
//
//        String createTable2="CREATE TABLE IF NOT EXISTS " +
//                tb2_name +            // 資料表名稱
//                "(name VARCHAR(32), " +    //姓名欄位
//                "phone VARCHAR(16), " +    //電話欄位
//                "price INTEGER ,"+            //價錢
//                "email VARCHAR(64),"+      //Email欄位
//                "address VARCHAR(64))";
//        db.execSQL(createTable1);    // 建立資料表
//
//        // 插入 3筆資料
//        addData1("加家民宿","0930-337130",1200,"http://jia.970bnb.net/","花蓮縣玉里鎮大禹里六鄰4-1號");
//        addData1("鏷石民宿","0910-468584",1200,"http://house.netete.com/bnb/pushi.htm","花蓮縣玉里鎮忠勇路62號");
//        addData1("美地雅居","0985-581885",1200,"http://www.6868meidiya.com/","花蓮縣玉里鎮興國路一段281號");
//
//        String createTable3="CREATE TABLE IF NOT EXISTS " +
//                tb3_name +            // 資料表名稱
//                "(name VARCHAR(32), " +    //姓名欄位
//                "phone VARCHAR(16), " +    //電話欄位
//                "price INTEGER ,"+            //價錢
//                "email VARCHAR(64),"+      //Email欄位
//                "address VARCHAR(64))";
//        db.execSQL(createTable1);    // 建立資料表
//
//        // 插入 3筆資料
//        addData1("樟之園民宿","(03)8772198 ",1500,"http://zhang.970bnb.net/","花蓮縣鳳林鎮林榮里林榮路235號");
//        addData1("鳳凰花園別墅","0921-146-229",1750,"http://www.netete.com/phoenix/","花蓮縣鳳林鎮鳳凰路58號");
//        addData1("花蓮康晨有機果園民宿","03-8762476",1750,"http://sunmorning.okgo.tw/","花蓮縣鳳林鎮北林里平康路5號");
//
//
//        /*TextView txv=(TextView)findViewById(R.id.txv);
//        txv.setText("資料庫檔路徑: " + db.getPath() + "\n\n" +   // 取得及顯示資料庫資訊
//                "資料庫分頁大小: " + db.getPageSize() + " Bytes\n\n" +
//                "資料庫大小上限: " + db.getMaximumSize() + " Bytes");*/
//
//        db.close();        // 關閉資料庫
//    }
//    private void addData1(String name, String phone,Integer price, String email,String address) {
//        ContentValues cv=new ContentValues(5);    // 建立含3個資料項目的物件
//        cv.put("name", name);
//        cv.put("phone", phone);
//        cv.put("price", price);
//        cv.put("email", email);
//        cv.put("address", address);
//
//        db.insert(tb1_name, null, cv);    // 將資料加到資料表
//    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
  }

    @Override
    public void onClick(View v) {
        if(v==findViewById(R.id.select1))
        {
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,select_region.class);
            startActivity(intent);
        }
        if(v==findViewById(R.id.select2))
        {
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,favorite.class);
            startActivity(intent);
        }
    }

}
