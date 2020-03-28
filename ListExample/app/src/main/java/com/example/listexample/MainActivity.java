package com.example.listexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list);

        List<String> data = new ArrayList<>();

        // ListView 와 List를 연결하기 위해서 중간다리 역할을하는 ArrayAdapter()
        // android.R.layout.simple_list_item_1는 안드로이드에서 제공해주는 폼
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);

        // list에 adapter 세팅
        list.setAdapter(adapter);
        data.add("안드로이드");
        data.add("자바스크립트");
        data.add("NodeJS");
        // adapter에 연결된 ListView를 갱신
        adapter.notifyDataSetChanged();
    }
}
