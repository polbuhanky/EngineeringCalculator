package dev.artem.engineeringcalculator.Constants;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;

import dev.artem.engineeringcalculator.MainActivity;

public final class SaveInfo {
    private static MainActivity activity;
    public static SharedPreferences pref;

    public SaveInfo(MainActivity activity){
        this.activity = activity;
    }

    public static void SaveString(String name, ArrayList<String> data){
        pref = activity.getSharedPreferences(name, Context.MODE_PRIVATE);

        pref.edit().putString(name, ArrayListToString(data, ";")).apply();
        Log.e("onSaveInfo", "Name: " + name + " Save: " + ArrayListToString(data, ";"));
    }

    public static ArrayList<String> GetData(String name){
        pref = activity.getSharedPreferences(name, Context.MODE_PRIVATE);

        if (pref.contains(name)) {
            String save = pref.getString(name, "none");
            if (!save.equals("none")) {
                return StringToArrayList(save, ";");
            }
        }
        return null;
    }

    public static String ArrayListToString(ArrayList<String> data, String separator){
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < data.size(); i++) {
            text.append(data.get(i));
            if (i != data.size() - 1) text.append(separator);
        }

        return text.toString();
    }

    public static ArrayList<String> StringToArrayList(String text, String separator){
        return new ArrayList<>(Arrays.asList(text.split(separator)));
    }
}
