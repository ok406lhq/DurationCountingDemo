package com.demo.durationcountingdemo;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2020/4/9.
 */

public class ShareprefUtils {

    private static SharedPreferences sp;
    private static String SP_NAME = "limit_config";

    public static void saveString(Context context, String key, String value) {
        if (null == sp) {
            sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        }

        SharedPreferences.Editor edit = sp.edit();
        edit.putString(key, value);
        edit.commit();
    }

    public static void saveBoolea(Context context, String key, boolean value) {
        if (null == sp) {
            sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        }

        SharedPreferences.Editor edit = sp.edit();
        edit.putBoolean(key, value);
        edit.commit();
    }

    /**
     * 保存long型
     *
     * @param context
     * @param key
     * @param value
     */
    public static void saveLong(Context context, String key, long value) {
        if (sp == null)
            sp = context.getSharedPreferences(SP_NAME, 0);
        sp.edit().putLong(key, value).commit();
    }

    /**
     * 保存int型
     *
     * @param context
     * @param key
     * @param value
     */
    public static void saveInt(Context context, String key, int value) {
        if (sp == null)
            sp = context.getSharedPreferences(SP_NAME, 0);
        sp.edit().putInt(key, value).commit();
    }

    /**
     * 保存float型
     *
     * @param context
     * @param key
     * @param value
     */
    public static void saveFloat(Context context, String key, float value) {
        if (sp == null)
            sp = context.getSharedPreferences(SP_NAME, 0);
        sp.edit().putFloat(key, value).commit();
    }

    /**
     * 获取int值
     *
     * @param context
     * @param key
     * @param defValue
     * @return
     */
    public static int getInt(Context context, String key, int defValue) {
        if (sp == null)
            sp = context.getSharedPreferences(SP_NAME, 0);
        return sp.getInt(key, defValue);
    }

    /**
     * 获取long值
     *
     * @param context
     * @param key
     * @param defValue
     * @return
     */
    public static long getLong(Context context, String key, long defValue) {
        if (sp == null)
            sp = context.getSharedPreferences(SP_NAME, 0);
        return sp.getLong(key, defValue);
    }

    /**
     * 获取float值
     *
     * @param context
     * @param key
     * @param defValue
     * @return
     */
    public static float getFloat(Context context, String key, float defValue) {
        if (sp == null)
            sp = context.getSharedPreferences(SP_NAME, 0);
        return sp.getFloat(key, defValue);
    }

    /**
     * 获取boolean值
     *
     * @param context
     * @param key
     * @return
     */
    public static Boolean getBoolean(Context context, String key) {
        if (null == sp) {
            sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        }

        return sp.getBoolean(key, false);
    }

    public static Boolean getBoolean(Context context, String key, boolean defBoolean) {
        if (null == sp) {
            sp = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        }

        return sp.getBoolean(key, defBoolean);
    }

    /**
     * 获取String值
     *
     * @param context
     * @param key
     * @param defValue
     * @return
     */
    public static String getString(Context context, String key, String defValue) {
        if (sp == null)
            sp = context.getSharedPreferences(SP_NAME, 0);
        return sp.getString(key, defValue);
    }

    public static String getString(Context context, String key) {
        if (sp == null)
            sp = context.getSharedPreferences(SP_NAME, 0);
        return sp.getString(key, "");
    }

    /**
     * delete_icon all infos in SharedPreferenced file
     *
     * @param context
     */
    public static void clear(Context context) {
        if (sp == null)
            sp = context.getSharedPreferences(SP_NAME, 0);
        sp.edit().clear().apply();
    }

//    public static void putLongValue(Context context,String name,){}
}
