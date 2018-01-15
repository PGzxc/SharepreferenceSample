package com.example.sharepreferencesample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText userName;
    private EditText passWors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        userName =  findViewById(R.id.username);
        passWors =  findViewById(R.id.password);
    }

    /**
     * 保存按钮的监听
     * @param view
     */
    public void save(View view) {
        //拿到用户输入的数据
        String name = userName.getText().toString().trim();
        String age = passWors.getText().toString().trim();
        //3,储存数据,类似于map
        SharePreferenceUtils.setName(name);
        SharePreferenceUtils.setAge(Integer.parseInt(age));

    }

    /**
     * 跳转的点击监听
     * @param view
     */
    public void change(View view) {
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        startActivity(intent);
    }
}
