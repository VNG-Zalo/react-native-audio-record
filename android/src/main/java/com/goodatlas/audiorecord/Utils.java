package com.rnzalocalltest.react;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;

/**
 * Created by ThuanNM on 10/8/2018.
 * RNZaloCallTest
 */
public class Utils {

    public static final String NAME_REFER = "audioengine";

    public static void anotherSetSpeakerOn(Context context, boolean b){
        AudioManager audioManager = (AudioManager)context.getSystemService(Context.AUDIO_SERVICE);
        audioManager.setMode(AudioManager.STREAM_MUSIC);
        audioManager.setSpeakerphoneOn(b);
    }

    public static void setKeyInt(Context context, String key, int value){
        SharedPreferences sharedPref = context.getSharedPreferences(
                NAME_REFER, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public static void setString(Context context, String key, String value){
        SharedPreferences sharedPref = context.getSharedPreferences(
                NAME_REFER, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static String getString(Context context, String key) {
        SharedPreferences sharedPref = context.getSharedPreferences(
                NAME_REFER, Context.MODE_PRIVATE);
        return sharedPref.getString(key, "");
    }

    public static int getInt(Context context, String key) {
        SharedPreferences sharedPref = context.getSharedPreferences(
                NAME_REFER, Context.MODE_PRIVATE);
        return sharedPref.getInt(key, -1);
    }
}
