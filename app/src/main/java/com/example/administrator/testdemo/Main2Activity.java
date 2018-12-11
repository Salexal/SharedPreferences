package com.example.administrator.testdemo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SharedPreferences key = getSharedPreferences("key",0);
        SharedPreferences.Editor editor = key.edit();
        editor.putBoolean("isVis",true);
        editor.commit();
        

    }
}
