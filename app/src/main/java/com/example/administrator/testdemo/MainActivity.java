package com.example.administrator.testdemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private boolean isVis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SharedPreferences key = getSharedPreferences("key", 0);
        isVis = key.getBoolean("isVis", false);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(!isVis){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Intent intent  = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                }
            }).start();


        }else{
            Intent intent  = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }


    }
}
