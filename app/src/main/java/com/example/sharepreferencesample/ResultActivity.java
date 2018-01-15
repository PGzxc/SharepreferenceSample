package com.example.sharepreferencesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by admin on 2018/1/15.
 */

public class ResultActivity extends AppCompatActivity {
    private EditText userName;
    private EditText passWord;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        userName = findViewById(R.id.username);
        passWord = findViewById(R.id.password);

    }

    /**
     * 得到数据按钮的监听
     * @param view
     */
    public void get(View view) {
        String name = SharePreferenceUtils.getName();
        int age = SharePreferenceUtils.getAge();
        userName.setText(name);
        passWord.setText(String.valueOf(age));
    }
}
