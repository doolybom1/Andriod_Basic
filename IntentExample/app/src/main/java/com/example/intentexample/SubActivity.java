package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView res_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        res_text = findViewById(R.id.res_text);

        Intent intent = getIntent();

        // name이 MainActivity에서 설정한 name값과 동일해야 값을 받을 수 있음
        String str = intent.getStringExtra("str");
        res_text.setText(str);

    }
}
