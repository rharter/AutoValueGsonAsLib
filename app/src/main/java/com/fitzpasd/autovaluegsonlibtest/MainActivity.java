package com.fitzpasd.autovaluegsonlibtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fitzpasd.mylibrary.AutoValueGsonAdapterFactory;
import com.google.gson.TypeAdapterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TypeAdapterFactory typeAdapterFactory = AutoValueGsonAdapterFactory.create();
    }
}
