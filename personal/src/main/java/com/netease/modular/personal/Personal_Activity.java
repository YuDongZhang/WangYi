package com.netease.modular.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Personal_Activity extends AppCompatActivity {
    public static final String TAG = "Personal_Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_main_activity);
        Log.e(TAG, "onCreate: "+getIntent().getStringArrayExtra("name") );
    }
}