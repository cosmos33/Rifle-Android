package com.mm.rifle.demo;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.view.View;
import android.widget.Button;

import com.mm.rifle.Rifle;
import com.mm.rifle.RifleException;
import com.mm.rifle.RifleExceptionType;

public class MainActivity extends Activity {

    private static final int READ_PHONE_STATE = 100;

    public static int checkSelfPermission(Context context, String permission) {
        if (permission == null) {
            throw new IllegalArgumentException("permission is null");
        } else {
            return context.checkPermission(permission, Process.myPid(), Process.myUid());
        }
    }

    public static void requestPermissions(final Activity activity, final String[] permissions, final int requestCode) {
            if (Build.VERSION.SDK_INT >= 23) {
                activity.requestPermissions(permissions, requestCode);
            }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE)
                != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(
                    this,
                    new String[]{Manifest.permission.READ_PHONE_STATE},
                    READ_PHONE_STATE);
        }

        setContentView(R.layout.activity_main);

        Button javaCrash = findViewById(R.id.java_crash);
        Button nativeCrash = findViewById(R.id.native_crash);
        Button reportException = findViewById(R.id.report_exception);

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

        reportException.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Rifle.reportException(new RuntimeException("测试一个异常上报"));
                Rifle.reportException(new RifleException(RifleExceptionType.JAVA));
            }
        });

    }
}
