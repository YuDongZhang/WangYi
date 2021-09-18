package com.netease.modular.order;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//能独立运行的组件化 , personal 不能独立运行 , 集成化
public class OrderMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity_main);
    }
}
