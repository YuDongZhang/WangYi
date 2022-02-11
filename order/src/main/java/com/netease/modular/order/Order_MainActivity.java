package com.netease.modular.order;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

//能独立运行的组件化 , personal 不能独立运行 , 集成化
public class Order_MainActivity extends AppCompatActivity {

    public static final String TAG = "Order_MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity_main);

    }
}
