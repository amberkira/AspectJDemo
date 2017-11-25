package com.example.sleepeanuty.ascpectj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.aspectj.lang.annotation.Pointcut;

import java.util.ConcurrentModificationException;
import java.util.concurrent.ConcurrentHashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callTest();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void callTest(){
        Log.e("call","call");
    }
}
