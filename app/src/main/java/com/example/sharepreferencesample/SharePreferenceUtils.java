package com.example.sharepreferencesample;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by admin on 2018/1/15.
 */

public class SharePreferenceUtils {
    private static final String FILE_MAME = "config";

    private static SharedPreferences getSharedPreferences() {
        return MyApplication.getmContext().getSharedPreferences(FILE_MAME, Context.MODE_PRIVATE);
    }
    public static  void setName(String name){
        getSharedPreferences().edit().putString("name", name).apply();
    }
    public static  String getName(){
      return   getSharedPreferences().getString("name", "name");
    }
    public static  void setAge(int age){
        getSharedPreferences().edit().putInt("age", age).apply();
    }
    public static  int getAge(){
       return getSharedPreferences().getInt("age",0);
    }
}
