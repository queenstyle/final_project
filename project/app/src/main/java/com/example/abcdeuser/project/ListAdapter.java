package com.example.abcdeuser.project;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by USER on 2016/6/13.
 */
public class ListAdapter extends BaseAdapter {

    private select_region mainActivity;
    private LayoutInflater myInflater;
    private ArrayList<HashMap<String, Object>> mylist = null;
    private ViewTag viewTag;

    public ListAdapter(select_region context, ArrayList<HashMap<String, Object>> Item) {
        //取得 MainActivity 實體
        this.mainActivity = context;
        this.myInflater = LayoutInflater.from(context);
        this.mylist = Item;
    }




    public String[] list = {"花蓮市","吉安鄉","壽豐鄉","鳳林鎮","光復鄉","瑞穗鄉","豐濱鄉","玉里鎮","富里鄉","新城鄉","秀林鄉","萬榮鄉","卓溪鄉"};


    @Override
    public int getCount() {
        return mylist.size();

    }

    @Override
    public Object getItem(int position) {
        return mylist.get(position);

    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            // 取得listItem容器 view
            convertView = myInflater.inflate(R.layout.landmark, null);
            // 建構listItem內容view
            viewTag = new ViewTag(
                    (TextView) convertView.findViewById(R.id.ItemName),
                    (Button) convertView.findViewById(R.id.ItemButton));

            // 設置容器內容
            convertView.setTag(viewTag);

        } else {
            viewTag = (ViewTag) convertView.getTag();
        }

        viewTag.text1.setText(list[position]);
        //設定按鈕監聽事件及傳入 MainActivity 實體
        viewTag.btn1.setOnClickListener(new ItemButton_Click(this.mainActivity, position));

        return convertView;

    }
    public class ViewTag {
        TextView text1;
        TextView btn1;

        public ViewTag(TextView textview1, Button button1) {

            this.text1 = textview1;
            this.btn1 = button1;
        }
    }
    class ItemButton_Click implements View.OnClickListener {
        private int position;
        private select_region mainActivity;

        ItemButton_Click(select_region context, int pos) {
            this.mainActivity = context;
            position = pos;
        }

        public void onClick(View v) {
            this.mainActivity.myDialog(position);
        }
    }


}