package com.netease.apt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.netease.R;
import com.netease.annotation.ARouter;
import com.netease.annotation.model.RouterBean;
import com.netease.apt.test.ARouter$$Group$$order;
import com.netease.apt.test.ARouter$$Path$$order;
import com.netease.arouter.api.core.ARouterLoadGroup;
import com.netease.arouter.api.core.ARouterLoadPath;
import com.netease.modular.personal.Personal_Activity;

import java.util.Map;

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

    public void jumpOrder(View view) {
//        Intent intent = new Intent(this, Order_MainActivity.class);
//        intent.putExtra("name", "simon");
//        startActivity(intent);

        // 最终集成化模式，所有子模块app/order/personal通过APT生成的类文件都会打包到apk里面，不用担心找不到
        ARouterLoadGroup group = new ARouter$$Group$$order();
        Map<String, Class<? extends ARouterLoadPath>> map = group.loadGroup();
        // 通过order组名获取对应路由路径对象
        Class<? extends ARouterLoadPath> clazz = map.get("order");

        try {
            // 类加载动态加载路由路径对象
            ARouter$$Path$$order path = (ARouter$$Path$$order) clazz.newInstance();
            Map<String, RouterBean> pathMap = path.loadPath();
            // 获取目标对象封装
            RouterBean bean = pathMap.get("/order/Order_MainActivity");

            if (bean != null) {
                startActivity(new Intent(this, bean.getClazz()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void jumpPersonal(View view) {
//        Intent intent = new Intent(this, Order_MainActivity.class);
//        intent.putExtra("name", "simon");
//        startActivity(intent);

        // 最终集成化模式，所有子模块app/order/personal通过APT生成的类文件都会打包到apk里面，不用担心找不到
//        ARouterLoadGroup group = new ARouter$$Group$$order();
//        Map<String, Class<? extends ARouterLoadPath>> map = group.loadGroup();
//        // 通过order组名获取对应路由路径对象
//        Class<? extends ARouterLoadPath> clazz = map.get("person");
//
//        try {
//            // 类加载动态加载路由路径对象
//            ARouter$$Path$$order path = (ARouter$$Path$$order) clazz.newInstance();
//            Map<String, RouterBean> pathMap = path.loadPath();
//            // 获取目标对象封装
//            RouterBean bean = pathMap.get("/person/Personal_Activity");
//
//            if (bean != null) {
//                Intent intent = new Intent(this, bean.getClazz());
//                intent.putExtra("name","simon");
//                startActivity(intent);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        /**
         * 这里需要配置到对应的才能跳转 , 就像是test包中的 后缀为order文件一样
         */
    }
}
