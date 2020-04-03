package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_save;
    private EditText ed_text;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_save = findViewById(R.id.btn_move);
        ed_text = findViewById(R.id.ed_text);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 입력된 값을 str에 저장
                str = ed_text.getText().toString();

                Intent intent = new Intent(MainActivity.this, SubActivity.class);

                // intent로 str이라는 이름으로 값을 넘겨줌
                intent.putExtra("str", str);
                startActivity(intent); // 액티비티 이동
            }
        });
    }
}
