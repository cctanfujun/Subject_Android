package com.xiaochen.listscroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.xiaochen.listscroll.adapter.ListViewAdapter;
import com.xiaochen.listscroll.data.MockData;

public class ListviewActivity extends AppCompatActivity {
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        mListView = (ListView) findViewById(R.id.listview);
        MockData mockData = new MockData();
        ListViewAdapter adapter = new ListViewAdapter(mockData.data,this);
        mListView.setAdapter(adapter);
    }
}
