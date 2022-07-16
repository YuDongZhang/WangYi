package com.netease.apt;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.netease.R;
import com.netease.annotation.ARouter;

@ARouter(path = "/app/PersonalActivity")
public class PersonalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("netease >>> ", "----------> PersonalActivity");
    }

    public void jump(View view) {
       // Intent intent = new Intent(this, MainActivity$$ARouter.findTargetClass("/app/MainActivity"));
       // startActivity(intent);
    }
}
