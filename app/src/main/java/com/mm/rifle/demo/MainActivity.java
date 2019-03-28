package com.mm.rifle.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mm.rifle.Rifle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button javaCrash = findViewById(R.id.java_crash);
        Button nativeCrash = findViewById(R.id.native_crash);

        // Java 崩溃
        javaCrash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Rifle.testJavaCrash();
            }
        });

        // Native 崩溃
        nativeCrash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Rifle.testNativeCrash();
            }
        });

    }
}
