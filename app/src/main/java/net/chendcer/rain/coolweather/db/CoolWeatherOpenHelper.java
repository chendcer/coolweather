package net.chendcer.rain.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by chend on 2016/2/21.
 */

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public static final String CREATE_PROVINCE = "create table province("
            + "id inteager primary key autoincrement,"
            + "province_name text"
            + "province_code text";

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
