package com.netease.modular.order;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.netease.annotation.ARouter;

//能独立运行的组件化 , personal 不能独立运行 , 集成化
@ARouter(path = "/order/Order_MainActivity")
public class Order_MainActivity extends AppCompatActivity {

    public static final String TAG = "Order_MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity_main);

    }
}
