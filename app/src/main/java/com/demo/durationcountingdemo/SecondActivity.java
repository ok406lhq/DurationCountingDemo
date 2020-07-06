package com.demo.durationcountingdemo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class SecondActivity extends Activity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView duration = findViewById(R.id.duration);
        duration.setText("累积统计时长：" + getFormatTime(ShareprefUtils.getLong(SecondActivity.this, "APP_USE_TIME", 0L)));
    }

    private String getFormatTime(long app_use_time) {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        //设置时区，跳过此步骤会默认设置为"GMT+08:00" 得到的结果会多出来8个小时
        format.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));

        return format.format(app_use_time);
    }
}
