package com.clase1android.clase1android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends Activity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        listView =  findViewById(R.id.text_view_id);

        List<String> numberList = new ArrayList<>();

        for(int i =0; i < 100; i++)
        {

            numberList.add(Integer.toString(i));
        }
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, R.layout.list_items, numberList);

        listView.setAdapter(ad);
    }
}
