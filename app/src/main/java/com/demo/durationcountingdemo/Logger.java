package com.demo.durationcountingdemo;

import android.util.Log;

public class Logger {

    private static final int V = 0;
    private static final int D = 1;
    private static final int I = 2;
    private static final int W = 3;
    private static final int E = 4;
    private static final int LEVEL = D;// 日志输出级别
    private static final String TAG = "DURATION_COUNTING_DEMO";

    public static boolean BUG = false;

    /**
     * 初始化阶段可以控制是否需要log
     * */
    public static void setLog(boolean bug) {
        BUG = bug;
    }

    /***
     * log选项
     * */
    public static void msg(String msg) {
        if (!BUG) {
            return;
        }
        if (msg==null) msg="  NULL";
        switch (LEVEL) {
            case V:
                Log.w(TAG, msg);
                break;
            case D:
                Log.d(TAG, msg);
                break;
            case I:
                Log.i(TAG, msg);
                break;
            case W:
                Log.w(TAG, msg);
                break;
            case E:
                Log.e(TAG, msg);
                break;
            default:
                break;
        }
    }
}
