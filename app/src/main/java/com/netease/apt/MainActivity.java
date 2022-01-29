package com.netease.apt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.netease.R;
import com.netease.annotation.ARouter;

@ARouter(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {
    //注解处理处理完了之后 , 可以在该路径下找到类似于
    //C:\AndroidStudioProjects\WangYi\app\build\generated\ap_generated_sources\debug\out\com\netease\apt\XActivity$$ARouter
    //C:\AndroidStudioProjects\WangYi\app\build\intermediates\javac\debug\classes\com\netease\apt\XActivity$$ARouter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 不需要了
        // RecordPathManager.joinGroup("app", "MainActivity", MainActivity.class);
    }

    public void jump(View view) {
        Intent intent = new Intent(this, OrderActivity$$ARouter.findTargetClass("/app/OrderActivity"));
        startActivity(intent);
    }
}
