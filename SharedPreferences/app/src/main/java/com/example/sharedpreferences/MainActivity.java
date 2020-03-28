package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_save;
    String shared = "file";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_save = (EditText)findViewById(R.id.et_save);

        /* 다시 앱을 들어왔을때 기존에 입력했던 값을 가져오는 부분 */
        SharedPreferences sharedPreferences = getSharedPreferences(shared,0);
        // 값을 꺼내오는 역할이기 때문에 defValue는 빈값으로 넣는다
        String value = sharedPreferences.getString("edit","");
        et_save.setText(value);


    }

    // MainActivity를 벗어났을때(뒤로가기 버튼을 누르거나 앱이 종료되었을 시)
    @Override
    protected void onDestroy() {
        super.onDestroy();

        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        // 입력된 값을 value에 저장
        String value = et_save.getText().toString();
        // value를 edit이라는 key로 저장
        editor.putString("edit", value);
        editor.commit();
    }
}
